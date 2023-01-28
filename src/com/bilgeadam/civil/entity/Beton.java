package com.bilgeadam.civil.entity;

public abstract class Beton extends Insaat {

    private int katSayisi;
    private int emsal;

    public abstract void katBasiInsaatAlani();


    public Beton(String insaatAdi, String insaatYeri, int agirlik, boolean cevreciMi, int arsaAlani, int katSayisi, int emsal) {
        super(insaatAdi, insaatYeri, agirlik, cevreciMi, arsaAlani);
        this.katSayisi = katSayisi;
        this.emsal = emsal;
    }

    @Override
    public String toString() {
        return super.toString()+" Türü= Beton " +
                "KatSayisi=" + katSayisi +
                ", Emsal=" + emsal ;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    public int getEmsal() {
        return emsal;
    }

    public void setEmsal(int emsal) {
        this.emsal = emsal;
    }

}
