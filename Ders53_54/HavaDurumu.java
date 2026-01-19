package Ders53_54;

public class HavaDurumu {

    private String sehir;
    private double sicaklik;

    public HavaDurumu(String sehir, double sicaklik) {
        this.sehir = sehir;
        this.sicaklik = sicaklik;
    }

    public String sehirGetir() {
        return this.sehir;
    }
    
    public double sicaklikGetir() {
        return this.sicaklik;
    }

    public void sicaklikGuncelle(double yeniSicaklik) {
        this.sicaklik = yeniSicaklik;
    }

    
}
