package com.bilgeadam.civil.entity;

import com.bilgeadam.civil.repository.IMaliyet;
import com.bilgeadam.civil.repository.IYapi;

public class Apartman extends  Beton implements IYapi, IMaliyet {
    int apartmanInsaatAlani;
    int apartmanKatBasiInsaatAlani;
    private final int apartmanM2Maliyet=5000;

    public Apartman(String insaatAdi, String insaatYeri, int agirlik, boolean cevreciMi, int arsaAlani, int katSayisi, int emsal) {
        super(insaatAdi, insaatYeri, agirlik, cevreciMi, arsaAlani, katSayisi, emsal);
    }

    @Override
    public int insaatYapimsuresi() {
        int sure=0;
        sure=getKatSayisi()*3;
        return sure;
    }
    @Override
    public void toplamInsaatAlani() {
        apartmanInsaatAlani=getArsaAlani()*getEmsal();
        System.out.println(getInsaatAdi()+"'nın toplam İnşaat Alanı: "
                +apartmanInsaatAlani+"m2 olarak hesaplanmıştır.");

    }
    @Override
    public void katBasiInsaatAlani() {
        apartmanKatBasiInsaatAlani=apartmanInsaatAlani/getKatSayisi();
        System.out.println(getKatSayisi()+" katlı planlanan "+getInsaatAdi()+"'nın " +
                "Kat Başına İnşaat Alanı: "+apartmanKatBasiInsaatAlani+"m2 olarak hesaplanmıştır.");

    }

    @Override
    public void insaatMaliyeti() {
        int apartmanMaliyet=apartmanM2Maliyet*apartmanInsaatAlani;
        System.out.println("->Arsa Alanı:"+getArsaAlani()+"\n"+"->Apartman M2 Maliyeti: "+ apartmanM2Maliyet+"\n"
                +"->İnşaat Alanı:"+apartmanInsaatAlani+"\n"+ "->Kat Adedi: "+ getKatSayisi()+"\n"+
                "Olan Yapının Ortalama Maliyeti: "+apartmanMaliyet+" TL olarak hesaplanmıştır.");

    }
}
