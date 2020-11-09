package com.softengine.service;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.softengine.bd.Firmas;
import com.softengine.model.Datas;
import com.softengine.model.FirmaConst;
import com.softengine.model.SeriesModel;
import com.softengine.network.FetchData;
import com.softengine.repository.BistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BistService {

    private final BistRepository bistRepository;

    public boolean fillTable() throws UnirestException {
        bistRepository.deleteAll();
        for (FirmaConst f: Firmas.firmaConstList) {
            bistRepository.saveAll(new FetchData(f).getData());
        }
        return true;
    }

    public List<Datas> getD() {
        return bistRepository.findEnCokDegisen("2020-11-02","2020-11-06");
    }
}
