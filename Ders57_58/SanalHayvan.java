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
    public void besle() {
        aclikSeviyesi -=10;
        if (aclikSeviyesi < 0) {
            aclikSeviyesi = 0;
        }
        mutlulukSeviyesi +=10; 
        if (mutlulukSeviyesi > 100) {
            mutlulukSeviyesi = 100;
        }
    }
}
