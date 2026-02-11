package Ders57_58;

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
        this.mutlulukSeviyesi += 5; // Mutluluk biraz artar
    }
    
    public void oyna() {
        System.out.println(this.isim + " ile oynanıyor...");
        this.mutlulukSeviyesi += 15; // Mutluluk artar
        this.aclikSeviyesi += 5; // Açlık biraz artar
    }
}
