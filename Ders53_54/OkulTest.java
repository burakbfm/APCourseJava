package Ders53_54;

public class OkulTest {
    public static void main(String[] var0) {
        Ogrenci ogrenci1 = new Ogrenci("Yaman Daldal",324,90.2,"Mezun Değil");
        Ogrenci ogrenci2 = new Ogrenci("Elif Yılmaz",125,85.5,"Mezun");
        Ogrenci ogrenci3 = new Ogrenci("Mert Kaya",213,78.0,"Mezun Değil");
        Ogrenci ogrenci4 = new Ogrenci("Zeynep Demir",432,92.3,"Mezun");


        if  (ogrenci1.OnurOgrencisiMi()) {
            System.out.println(ogrenci1.isimGetir() + " bir onur öğrencisidir.");
        } else {
            System.out.println(ogrenci1.isimGetir() + " bir onur öğrencisi değildir.");
        }

        System.out.println(ogrenci3.isimGetir() + " öğrencisi " + ogrenci3.mezunOlduMuGetir());

        ogrenci3.mezunEt();

        System.out.println(ogrenci3.isimGetir() + " öğrencisi " + ogrenci3.mezunOlduMuGetir());

        System.out.println(ogrenci1.isimGetir() + " öğrencisinin not ortalaması: " + ogrenci1.notOrtalamasiGetir());
        ogrenci1.AktiviteYap();
        ogrenci1.AktiviteYap();
        ogrenci1.AktiviteYap();
        System.out.println("Aktivite sonrası " + ogrenci1.isimGetir() + " öğrencisinin not ortalaması: " + ogrenci1.notOrtalamasiGetir());

        System.out.println(ogrenci2.isimGetir() + " öğrencisinin not ortalaması: " + ogrenci2.notOrtalamasiGetir());
        ogrenci2.notGuncelle(98.5);
        System.out.println(ogrenci2.isimGetir() + " öğrencisinin not ortalaması: " + ogrenci2.notOrtalamasiGetir());

        // Bu problemi çözmekiçin Ogrenci sınıfına yeni bir metot ekleyin. Bu metodun imzası şöyle
        // olacaktır: public boolean dahaMiBasarili(Ogrenci digerOgrenci)

        // Mantığı Açıklama: Bu metot çağrıldığında ( ogr1.dahaMiBasarili(ogr2) ), iki tane Ogrenci
        // nesnesi vardır:

        // 1. Metodun içinde olduğumuz nesne ( this ile temsil edilen, yani ogr1 ).
        // 2. Metoda parametre olarak gelen nesne ( digerOgrenci ile temsil edilen, yani ogr2 ).

        // Metodun içinde, “kendi” ortalamamız ( this.notOrtalamasi ) ile “diğer öğrencinin”
        // ortalamasını ( digerOgrenci.getNotOrtalamasi() ) karşılaştırırız.

        // Diğer öğrencinin private olan notOrtalamasi değişkenine doğrudan erişemediğimizi, bu
        // yüzden onun public olan getNotOrtalamasi() metodunu kullanmakzorunda olduğumuzu
        // vurgulayın (Kapsülleme’nin gücü!).

        // Bu metodu Ogrenci.java ’ya ekleyin ve OkulTest.java içinden çağıraraktest edin.
        

        if (ogrenci1.dahaMiBasarili(ogrenci2)) {
            System.out.println(ogrenci1.isimGetir() + " öğrencisi " + ogrenci2.isimGetir() + " öğrencisinden daha başarılı.");
        } else {
            System.out.println(ogrenci1.isimGetir() + " öğrencisi " + ogrenci2.isimGetir() + " öğrencisinden daha başarılı değil.");
        }
    }
}
