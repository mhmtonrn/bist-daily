package com.softengine.bd;

import com.softengine.model.FirmaConst;

import java.util.ArrayList;
import java.util.List;

public class Firmas {
    public static final List<FirmaConst> firmaConstList;


    static {
        firmaConstList = new ArrayList<>();
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/aciselsan-acipay","ACISELSAN ACIPAY","ACSEL"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/adana-cimento-a","ADANA CIMENTO-A","ADANA"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/adana-cimento-b","ADANA CIMENTO-B","ADGBR"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/adel-kalemcilik","ADEL KALEMCILIK","ADEL"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/adana-cimento-c","ADANA CIMENTO-C","ADNAC"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/anadolu-efes-bir","ANADOLU EFES BIR","AEFES"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/afyon-cimento","AFYON CIMENTO","AFYON"));
        firmaConstList.add(new FirmaConst("http://www.bloomberght.com/piyasa/refdata/ag-anadolu-grubu","AG ANADOLU GRUBU","AGHOL"));
    }






}
