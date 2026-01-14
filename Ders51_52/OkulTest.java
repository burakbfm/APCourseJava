package Ders51_52;

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
        ogrenci1.AktiviteYap();
                ogrenci1.AktiviteYap();
                        ogrenci1.AktiviteYap();
                                ogrenci1.AktiviteYap();
                                
        ogrenci1.AktiviteYap();
        System.out.println("Aktivite sonrası " + ogrenci1.isimGetir() + " öğrencisinin not ortalaması: " + ogrenci1.notOrtalamasiGetir());
    }
}
