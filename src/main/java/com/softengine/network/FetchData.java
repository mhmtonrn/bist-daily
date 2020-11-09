package com.softengine.network;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.softengine.model.FirmaConst;
import com.softengine.model.SeriesModel;
import org.json.JSONArray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

//"http://www.bloomberght.com/piyasa/refdata/acibadem-saglik"
public class FetchData {
    private FirmaConst baseUrl;

    public FetchData(FirmaConst baseUrl) {
        this.baseUrl = baseUrl;
    }

    public List<SeriesModel> getData() throws UnirestException {
        HttpResponse<JsonNode> response = Unirest.get(baseUrl.getBaseUrl()).asJson();
        JSONArray seriesData = response.getBody().getObject().getJSONArray("SeriesData");
        List<SeriesModel> seriesModels = new ArrayList<>();
        for (Object i:seriesData){
            System.out.println(baseUrl.getFirmaAdi()+" işlem yapılıyor");
            SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");


            JSONArray gunlukData = (JSONArray) i;
            LocalDate myDate = Instant.ofEpochMilli(gunlukData.getLong(0)).atZone(ZoneId.systemDefault()).toLocalDate();
            String strDate = sm.format(gunlukData.getLong(0));
            SeriesModel s = new SeriesModel();
            s.setTarih(strDate);
            s.setFirma(baseUrl.getFirmaAdi());
            s.setDeger(gunlukData.getDouble(1));
            seriesModels.add(s);
        }
        return seriesModels;
    }

    public static void main(String[] args) throws UnirestException, ParseException {
        new FetchData(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/tav-havalimanlar","Acı Badem","aci")).getData();
    }
}
