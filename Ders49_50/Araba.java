package Ders49_50;

public class Araba {
    private String marka;
    private String model;
    private int yil;
    private String renk;

    public Araba(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    public Araba() {
        this.marka = "Bilinmiyor";
        this.model = "Bilinmiyor";
        this.yil = 0;
        this.renk = "Bilinmiyor";
    }

    public Araba(String marka) {
        this.marka = marka;
        this.model = "Bilinmiyor";
        this.yil = 0;
        this.renk = "Bilinmiyor";
    }

    public void arabaBilgileriYazdir() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Yıl: " + this.yil);
        System.out.println("Renk: " + this.renk);
    }

    public void arabarenkguncelleme(String yeniRenk) {
        this.renk = yeniRenk;
    }

    public Integer arabaYilGetir() {
        return this.yil;
    }

    public String arabaRenkGetir() {
        return this.renk;
    }

}
