package Ders49_50;

public class ArabaFabrika {
    public static void main(String[] var0) {
        Araba araba1 = new Araba("Toyota", "Corolla", 2020, "Beyaz");

        araba1.arabaBilgileriYazdir();

        araba1.arabarenkguncelleme("Yeşil");

        System.out.println("**************");
        araba1.arabaBilgileriYazdir();
        System.out.println("**************");

        System.out.println("Arabanın yılı: " + araba1.arabaYilGetir());
        System.out.println("Arabanın Yeni Rengi: " + araba1.arabaRenkGetir());
    }

    
}
