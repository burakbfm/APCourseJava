package Ders59_60;

public class SanalHayvan {
    
    // Özellikler
    // isim, tür, yaş, aclik seviyesi, mutluluk seviyesi

    // metotlar
    // besle() , oyna(), uyu(), bilgiGoster()

    // 1. Özellikleri private instance değişkenler

    private String isim;
    private String tur;
    private int yas;
    private int aclikSeviyesi;
    private int mutlulukSeviyesi;

    // 2. yapıcı metot Constructor
    public SanalHayvan(String isim, String tur, int yas) {
        this.isim = isim;
        this.tur = tur;
        this.yas = yas;
        this.aclikSeviyesi = 50; // Başlangıç açlık seviyesi
        this.mutlulukSeviyesi = 50; // Başlangıç mutluluk seviyesi
    }

    // 3.davranışlar (public methods) 
    public int getAclikSeviyesi() { 
        return this.aclikSeviyesi; 
    }
    public int getMutlulukSeviyesi() { 
        return this.mutlulukSeviyesi; 
    }
    // Davranış Metotları
    public void besle() {
        System.out.println(this.isim + " besleniyor...");
        this.aclikSeviyesi -= 10; // Açlık azalır
        if (this.aclikSeviyesi < 0) {
            this.aclikSeviyesi = 0; // Açlık seviyesi 0'ın altına düşemez
            System.out.println(this.isim + " artık aç değil!");
        }
        this.mutlulukSeviyesi += 5; // Mutluluk artar
        if (this.mutlulukSeviyesi > 100) {
            this.mutlulukSeviyesi = 100; // Mutluluk seviyesi 100'ün üstüne çıkmamalı
            System.out.println(this.isim + " çok mutlu!");
        }
    }
    
    public void oyna() {
        System.out.println(this.isim + " ile oynanıyor...");
        this.aclikSeviyesi += 5; // Açlık artar
        if (this.aclikSeviyesi > 100) {
            this.aclikSeviyesi = 100; // Açlık seviyesi 100'ün üstüne çıkmamalı
            System.out.println(this.isim + " artık çok aç!");
        }
        this.mutlulukSeviyesi += 15; // Mutluluk artar
        if (this.mutlulukSeviyesi > 100) {
            this.mutlulukSeviyesi = 100; // Mutluluk seviyesi 100'ün üstüne çıkmamalı
            System.out.println(this.isim + " çok mutlu!");
        }
    }

    // Zamangetir. aclık seviyesi artır, mutluluk seviyesi azalt
    // aclık seviyesi ve mutlulyk sınırı geçmemeli

    // Oyun oynamak. mutluluk seviyesi artır, açlık seviyesi artır
    // mutluluk sınırı 100, açlık sınırı 100 geçmemeli

    //beslenmek. açlık seviyesi azalt, mutluluk seviyesi artır
    // açlık seviyesi 0'ın altına düşmemeli, mutluluk seviyesi 100'ün üstüne çıkmamalı
}
