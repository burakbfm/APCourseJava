package Ders47_48;

public class OkulTest {
    public static void main(String[] var0) {
        Ogrenci ogr1 = new Ogrenci("Burak Üstün", 43, 85, true);
        Ogrenci ogr2 = new Ogrenci("Ahmet Çakar", 55, 62, false);
        // String ad = "Burak"
        // System.out.println(ad)
        System.out.println(ogr1);
        System.out.println(ogr2);
        ogr1.bilgileriyazdirma();

    }
}
