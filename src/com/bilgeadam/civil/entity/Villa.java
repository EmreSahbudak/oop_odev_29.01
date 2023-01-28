package com.bilgeadam.civil.entity;

import com.bilgeadam.civil.repository.IMaliyet;
import com.bilgeadam.civil.repository.IYapi;

public class Villa extends Beton implements IYapi, IMaliyet {
    int villaInsaatAlani;
    int villaKatBasiInsaatAlani;
    private final int villaM2Maliyet=10000;


    public Villa(String insaatAdi, String insaatYeri, int agirlik, boolean cevreciMi, int arsaAlani, int katSayisi, int emsal) {
        super(insaatAdi, insaatYeri, agirlik, cevreciMi, arsaAlani, katSayisi, emsal);
    }

    //Insaat ana abstract classından abstract,return metot
    @Override
    public int insaatYapimsuresi() {
        int sure=0;
        sure=getKatSayisi()*3;
        return sure;
    }

    //interface metot
    @Override
    public void toplamInsaatAlani() {
        villaInsaatAlani=getArsaAlani()*getEmsal();
        System.out.println(getInsaatAdi()+"'nın toplam İnşaat Alanı: "
                +villaInsaatAlani+"m2 olarak hesaplanmıştır.");
    }
    // Beton abstract classından abstract metot
    @Override
    public void katBasiInsaatAlani() {
        villaKatBasiInsaatAlani=villaInsaatAlani/getKatSayisi();
        System.out.println(getKatSayisi()+" katlı planlanan "+getInsaatAdi()+"'nın " +
                "Kat Başına İnşaat Alanı: "+villaKatBasiInsaatAlani+"m2 olarak hesaplanmıştır.");

    }
    //Genel interface metot
    @Override
    public void insaatMaliyeti() {
        int villaMaliyet=villaM2Maliyet*villaInsaatAlani;
        System.out.println("->Arsa Alanı:"+getArsaAlani()+"\n"+"->Villa M2 Maliyeti: "+ villaM2Maliyet+"\n"
        +"->İnşaat Alanı:"+villaInsaatAlani+"\n"+ "->Kat Adedi: "+ getKatSayisi()+"\n"+
        "Olan Yapının Ortalama Maliyeti: "+villaMaliyet+" TL olarak hesaplanmıştır.");

    }
}
