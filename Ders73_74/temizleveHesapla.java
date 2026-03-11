package Ders73_74;

import java.util.ArrayList;

public class temizleveHesapla {
    public static void main(String[] var0) {
        //“Bir Ogrenci sınıfımız var. Her öğrencinin getOrtalama() ve isAktif() (kaydı aktif mi?)
        // metotları bulunuyor. Ogrenci nesnelerinden oluşan bir ArrayList ’imiz ( ogrenciListesi ) var.”

        // Görev: “Ortalaması 70’in altında olan ve kaydı aktif olmayan ( isAktif() metodu false
        // dönen) tüm öğrencileri listeden silen ve ardından listede kalan öğrencilerin not ortalamasını
        // hesaplayıp double olarak döndüren bir metot yazın.”

        ArrayList<ogrenci> ogrencilistesi = new ArrayList<>();
        ogrencilistesi.add(new ogrenci(54.1, false));
        ogrencilistesi.add(new ogrenci(54.1, false));
        ogrencilistesi.add(new ogrenci(54.1, false));
        ogrencilistesi.add(new ogrenci(54.1, false));
        ogrencilistesi.add(new ogrenci(54.1, false));

        for (int i = ogrencilistesi.size() -1; i >=0; i--) {
            ogrenci ogr = ogrencilistesi.get(i);
            if (ogr.getOrtalama() < 70 && !ogr.isAktif()) {
                ogrencilistesi.remove(i);
            }

        }
        int sinifmevcudu = ogrencilistesi.size();
        if (sinifmevcudu == 0) {

            System.out.println("Ortalaması hesaplanacak öğrenci kalmadı!");

        } else {

            double toplam = 0;
            for (ogrenci ogr : ogrencilistesi) {
                toplam += ogr.getOrtalama();
            }
            System.out.println(toplam / sinifmevcudu);
        }


    }
}
