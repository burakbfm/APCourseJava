package Ders53_54;

public class HavaDurumuKanali {
    public static void main(String[] args) {
        HavaDurumu istanbulHava = new HavaDurumu("İstanbul", 22.5);
        System.out.println(istanbulHava.sehirGetir() + " şehrinin sıcaklığı: " + istanbulHava.sicaklikGetir() + "°C");
        istanbulHava.sicaklikGuncelle(27.4);
        System.out.println("Güncellenen sıcaklık: " + istanbulHava.sicaklikGetir() + "°C");
    }
    
    
}
