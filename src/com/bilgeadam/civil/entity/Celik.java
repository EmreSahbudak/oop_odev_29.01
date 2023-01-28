package com.bilgeadam.civil.entity;

public abstract class Celik extends  Insaat{
    private int bakimTekrarSuresi;

    public abstract void bakimMaliyeti();

    public Celik(String insaatAdi, String insaatYeri, int agirlik, boolean cevreciMi, int arsaAlani, int bakimTekrarSuresi) {
        super(insaatAdi, insaatYeri, agirlik, cevreciMi, arsaAlani);
        this.bakimTekrarSuresi = bakimTekrarSuresi;
    }

    @Override
    public String toString() {
        return  super.toString()+" Yapı Türü; Celik " +","+
                "Bakım Tekrar Süresi=" + bakimTekrarSuresi +
                " Yılda Birdir.";
    }

    public int getBakimTekrarSuresi() {
        return bakimTekrarSuresi;
    }

    public void setBakimTekrarSuresi(int bakimTekrarSuresi) {
        this.bakimTekrarSuresi = bakimTekrarSuresi;
    }
}
