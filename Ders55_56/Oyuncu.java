package Ders55_56;

public class Oyuncu {

    // Gereksinimler:
    // Özellikler (Instance): Her oyuncunun bir kullaniciAdi ( String ) ve bir skor ’u ( int ) olmalı.

    // Paylaşılan Özellik (Static): Tüm oyuncular için geçerli olan oyunAdi ( String ) adında tek bir değişken olmalı.

    // Constructor: Oyuncu, kullanıcı adıyla yaratılmalı ve skoru 0 olarak başlamalı. 
    
    // Davranışlar (Metotlar):
    // getKullaniciAdi() , getSkor() gibi getter’lar.
    // public static String getOyunAdi() gibi bir static getter.
    // public void skorArttir(int puan) : Oyuncunun skorunu verilen puan kadar artıran bir metot.
    // public boolean rekorKirdi(int rekorSkor) : Oyuncunun skorunun, parametre olarak
    // gelen rekor skordan yüksek olup olmadığını kontrol eden bir metot.


    // instance Değişkenler
    private String kullaniciAdi;
    private int skor;

    // Static Değişken
    private static String oyunAdi = "Macera Dünyası";

    public Oyuncu(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
        this.skor = 0; // Skor 0'dan başlar
    }

    public String getKullaniciAdi() { 
        return this.kullaniciAdi; 
    }

    public int getSkor() { 
        return this.skor; 
    }

    public static String getOyunAdi() { 
        return oyunAdi; 
    }

    public void skorArttir(int puan) {
        this.skor += puan;
    }

    public boolean rekorKirdi(int rekorSkor) {
        return this.skor > rekorSkor;
    }
    
}
