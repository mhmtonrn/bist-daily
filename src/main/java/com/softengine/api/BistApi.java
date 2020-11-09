package com.softengine.api;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.softengine.model.Datas;
import com.softengine.model.SeriesModel;
import com.softengine.service.BistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BistApi {

    private final BistService bistService;

    @PostMapping("/fillTable")
    public boolean fillTable() throws UnirestException {
       return bistService.fillTable();
    }

    @GetMapping("/test")
    public List<Datas> getd(){
        return bistService.getD();
    }
}
