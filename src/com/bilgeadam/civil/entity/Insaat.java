package com.bilgeadam.civil.entity;

public abstract class Insaat {
    private String insaatAdi;
    private String insaatYeri;
    private int agirlik;
    private boolean cevreciMi;
    private int arsaAlani;

    public abstract int insaatYapimsuresi();

    public Insaat(String insaatAdi, String insaatYeri, int agirlik, boolean cevreciMi, int arsaAlani) {
        this.insaatAdi = insaatAdi;
        this.insaatYeri = insaatYeri;
        this.agirlik = agirlik;
        this.cevreciMi = cevreciMi;
        this.arsaAlani = arsaAlani;
    }

    @Override
    public String toString() {
        return "Insaat= '" + insaatAdi + '\'' +
                ", Insaat Yeri='" + insaatYeri + '\'' +
                ", Agirlik=" + agirlik +" Ton"+
                ", Cevreci mi=" + cevreciMi +" ";
    }

    public String getInsaatAdi() {
        return insaatAdi;
    }

    public void setInsaatAdi(String insaatAdi) {
        this.insaatAdi = insaatAdi;
    }

    public String getInsaatYeri() {
        return insaatYeri;
    }

    public void setInsaatYeri(String insaatYeri) {
        this.insaatYeri = insaatYeri;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public boolean isCevreciMi() {
        return cevreciMi;
    }

    public void setCevreciMi(boolean cevreciMi) {
        this.cevreciMi = cevreciMi;
    }

    public int getArsaAlani() {
        return arsaAlani;
    }

    public void setArsaAlani(int arsaAlani) {
        this.arsaAlani = arsaAlani;
    }
}
