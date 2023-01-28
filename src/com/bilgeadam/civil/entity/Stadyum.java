package com.bilgeadam.civil.entity;

import com.bilgeadam.civil.repository.IMaliyet;

public class Stadyum extends  Celik implements IMaliyet {
    private final int stadyumM2Maliyet=20000;
    int stadyumMaliyet;
    public Stadyum(String insaatAdi, String insaatYeri,
                   int agirlik, boolean cevreciMi, int arsaAlani, int bakimTekrarSuresi) {
        super(insaatAdi, insaatYeri, agirlik, cevreciMi, arsaAlani, bakimTekrarSuresi);
    }

    @Override
    public void bakimMaliyeti() {
        int bakimMaliyeti=stadyumMaliyet/3000;
        System.out.println(getInsaatAdi()+" her "+getBakimTekrarSuresi()+" yılda bir düzenli olarak Bakım Maliyeti= "+bakimMaliyeti+"TL");
    }
    @Override
    public int insaatYapimsuresi() {
        int sure=0;
        sure=getAgirlik()/200;
        return sure;
    }
    @Override
    public void insaatMaliyeti() {
        stadyumMaliyet=stadyumM2Maliyet*getArsaAlani();
        System.out.println("->Arsa Alanı:"+getArsaAlani()+"\n"+"->Fabrika M2 Maliyeti: "+ stadyumM2Maliyet+"\n"+
                "Olan Yapının Ortalama Maliyeti: "+stadyumMaliyet+" TL olarak hesaplanmıştır.");

    }
}
