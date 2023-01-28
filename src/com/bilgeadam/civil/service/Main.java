package com.bilgeadam.civil.service;

import com.bilgeadam.civil.entity.Apartman;
import com.bilgeadam.civil.entity.Fabrika;
import com.bilgeadam.civil.entity.Stadyum;
import com.bilgeadam.civil.entity.Villa;
import com.bilgeadam.civil.repository.Yapi;

public class Main {
    public static void main(String[] args) {
        Yapi yapi=new Yapi();
        System.out.println("********************Vilaa********************************");
        Villa villaYeniKoy=new Villa("Villa","Antalya",2000,false,300,2,2);
        System.out.println("İnşaat genel bilgisi;");
        System.out.println(villaYeniKoy);
        System.out.println("İnşaat Süresi Hesaplama;");
        System.out.println(villaYeniKoy.getKatSayisi()+" kat olarak planlanan "+villaYeniKoy.getInsaatAdi()
                +"'nin yapım süresi ortalama "+villaYeniKoy.insaatYapimsuresi()+" Aydır.");
        System.out.println("Toplam İnşaat Alani;");
        yapi.villaYap(villaYeniKoy);
        villaYeniKoy.insaatMaliyeti();
        /*******************************************************************************************************/
        System.out.println("********************Aparman********************************");
        Apartman apartmanLale=new Apartman("Apartman","Denizli",5000,
                false,1500,4,1);
        System.out.println("İnşaat genel bilgisi;");
        System.out.println(apartmanLale);
        System.out.println("İnşaat Süresi Hesaplama;");
        System.out.println(apartmanLale.getKatSayisi()+" kat olarak planlanan "+apartmanLale.getInsaatAdi()
                +"'nin yapım süresi ortalama "+apartmanLale.insaatYapimsuresi()+" Aydır.");
        System.out.println("Toplam İnşaat Alani;");
        yapi.apartmanYap(apartmanLale);
        apartmanLale.insaatMaliyeti();
        System.out.println("********************Fabrika********************************");
        Fabrika fabrikaAtes=new Fabrika("Fabrika","Denizli",60000,true,4500,4);
        System.out.println("İnşaat genel bilgisi;");
        System.out.println(fabrikaAtes);
        System.out.println("İnşaat Süresi Hesaplama;");
        System.out.println(fabrikaAtes.getArsaAlani()+" m2'ye yapılması planlanan "+fabrikaAtes.getInsaatAdi()
                +"'nın yapım süresi ortalama "+fabrikaAtes.insaatYapimsuresi()+" Aydır.");
        System.out.println("Toplam Fabrika Maliyeti;");
        fabrikaAtes.insaatMaliyeti();
        fabrikaAtes.bakimMaliyeti();

        System.out.println("********************Stadyum********************************");
        Stadyum stadyumSaracoglu=new Stadyum("Stadyum","İstanbul",10000,true,20000,2);
        System.out.println("İnşaat genel bilgisi;");
        System.out.println(stadyumSaracoglu);
        System.out.println("İnşaat Süresi Hesaplama;");
        System.out.println(stadyumSaracoglu.getArsaAlani()+" m2'ye yapılması planlanan "+stadyumSaracoglu.getInsaatAdi()
                +"'nın yapım süresi ortalama "+stadyumSaracoglu.insaatYapimsuresi()+" Aydır.");
        System.out.println("Toplam Stadyum Maliyeti;");
        stadyumSaracoglu.insaatMaliyeti();
        stadyumSaracoglu.bakimMaliyeti();














        int input=0;
        switch (input){
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }













    }













}
