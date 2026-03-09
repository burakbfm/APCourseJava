package Ders71_72;

public class SanalHayvan {
    // Sanal hayvan üretim sınıfı
    // sanal hayvanların özelliklerini ve davranışlarını tanımlayabiliriz
    // isim - mutluluk seviyesi - tür gibi özellikler ekleyebiliriz
    private String isim;
    private int mutlulukSeviyesi;
    private String tur;

    public SanalHayvan(String isim, int mutlulukSeviyesi, String tur) {
        this.isim = isim;
        this.mutlulukSeviyesi = mutlulukSeviyesi;
        this.tur = tur;
    }

    public String isimgetir() {
        return this.isim;
    }

    public Integer mutlulukseviyesigetir() {
        return this.mutlulukSeviyesi;
    }

    public String turgetir() {
        return this.tur;
    }
}
