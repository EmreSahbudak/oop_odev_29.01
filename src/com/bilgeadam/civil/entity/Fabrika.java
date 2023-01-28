package com.bilgeadam.civil.entity;

import com.bilgeadam.civil.repository.IMaliyet;

public class Fabrika extends Celik implements IMaliyet {
    private final int fabrikaM2Maliyet=4000;
    int fabrikaMaliyet;


    public Fabrika(String insaatAdi, String insaatYeri, int agirlik, boolean cevreciMi, int arsaAlani, int bakimTekrarSuresi) {
        super(insaatAdi, insaatYeri, agirlik, cevreciMi, arsaAlani, bakimTekrarSuresi);
    }

    @Override
    public void bakimMaliyeti() {
        int bakimMaliyeti=fabrikaMaliyet/2000;
        System.out.println(getInsaatAdi()+" her "+getBakimTekrarSuresi()+" yılda bir düzenli olarak Bakım Maliyeti= "+bakimMaliyeti);
    }
    @Override
    public int insaatYapimsuresi() {
        int sure=0;
        sure=getAgirlik()/1000;
        return sure;
    }

    @Override
    public void insaatMaliyeti() {
        fabrikaMaliyet=fabrikaM2Maliyet*getArsaAlani();
        System.out.println("->Arsa Alanı:"+getArsaAlani()+"\n"+"->Fabrika M2 Maliyeti: "+ fabrikaM2Maliyet+"\n"+
                "Olan Yapının Ortalama Maliyeti: "+fabrikaMaliyet+" TL olarak hesaplanmıştır.");
    }
}
