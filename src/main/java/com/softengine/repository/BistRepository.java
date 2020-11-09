package com.softengine.repository;

import com.softengine.model.Datas;
import com.softengine.model.SeriesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BistRepository  extends JpaRepository<SeriesModel,String> {

    @Query(value = "SELECT firma,sum(ALT) ALT, sum(UST) UST , sum(UST) - sum(ALT) FARK FROM (" +
            "  SELECT tarih, firma,deger as ALT, 0 as UST  FROM series a WHERE tarih = ?1 " +
            "  UNION" +
            "  SELECT tarih, firma, 0 as ALT, deger as UST  FROM series u WHERE tarih = ?2" +
            ")a group by firma order by FARK desc limit 20", nativeQuery = true)
    List<Datas> findEnCokDegisen(String basTarih, String bitTarih);


}