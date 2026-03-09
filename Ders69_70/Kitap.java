package Ders69_70;

public class Kitap {
    private int sayfaSayisi;
    private String kitapTuru;
    private String isim;

    public Kitap (int ss, String t, String i) {
        this.sayfaSayisi = ss;
        this.kitapTuru = t;
        this.isim = i;
    }

    public int sayfasayisiver() {
        return this.sayfaSayisi;
    }

    public String turuver() {
        return this.kitapTuru;
    }

    public String isimver() {
        return this.isim;
    }

}
