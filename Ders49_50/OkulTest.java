package Ders49_50;

public class OkulTest {
    public static void main(String[] var0) {
        Ogrenci ogr1 = new Ogrenci("Burak Üstün", 43, 85,true);
        Ogrenci ogr2 = new Ogrenci("Ahmet Çakar", 55, 62, false);
        // String ad = "Burak"
        // System.out.println(ad)
        
        // ogr1.bilgileriyazdirma();

        // Overloading (Aşırı Yükleme)
        // Aynı isimde birden fazla metot tanımlama işlemine denir.
        // Metot imzaları farklı olmalıdır.
        // Metot imzası: metot adı + parametre listesi
        // Metot imzası farklı ise, dönüş tipi farklı olsa bile metotlar farklı kabul edilir.
        // Sytem.out.println() metodu birden fazla şekilde tanımlanmıştır.
        // println(int a) - println(5)
        // println(double a) - println(3.14)
        // println(String a) - println("Burak")
        Ogrenci ogr3 = new Ogrenci();
        ogr3.bilgileriyazdirma();


        // Teori 1 
        // void Metotlar (Eylem metodları)
        // Bu metotlar bir eylem gerçekleştirir bir durumu değiştirir geriye bir değer döndürmediklkeri
        // için void (boşluk geçersiz) anahtar kelimesi ile tanımlanır.
        ogr1.notGuncelle(90);

        // Teori 2
        // değer dönüdren metotlar
        // Bu metotlar bir soruya cevap verir, bir bilgiyi getirir veya bir sonuç hesaplar
        // void yerine, döndürekleri verinin tipini (int, double, string ...) başlıklarında belitritler.
        ogr1.isimGetir();

        Ogrenci ogr4 = new Ogrenci("Ayşe Yılmaz");
        ogr4.bilgileriyazdirma();
        ogr4.notGuncelle(85);
        ogr4.bilgileriyazdirma();


        // -- GENEL ÖZET --
        // Bazı metotlar komut gibidir
        // bilgileriyazdir() // komut
        // Bazı metotlar soru gibidir
        // Math.sqrt(25) // soru cevap

    }
}
