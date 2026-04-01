package Ders77_78;

public class SutunToplam {
    public static void main(String[] var0) {

        // “Tüm matrisin toplamını bulmak yerine, bazen daha spesifik bilgilere ihtiyacımız olur. Örneğin,
        // bir şirketin yıllıksatış tablosunda sadece ‘Şubat’ayına ait (örneğin 1. indeksteki sütun) satışların
        // toplamını bulmak gibi. Bunu nasıl yaparız?”

        // Algoritma Tasarımı (10 dk):
        // “Belirli bir sütundaki tüm elemanları toplamakiçin, sütun indeksini sabit tutarken tüm satırları gezmemiz gerekir.”


        // Mantık:
        // 1. Bir toplam biriktirici değişkeni oluştur ( 0 ’dan başlat).
        int satislar[][] = { {100,200,150},
                             {120,210,160},
                             {180,250,260} };

        // 2. Hedef sütunun indeksini bir değişkende tut ( int hedefSutun = 1; ).
        int hedefSutun = 0;

        int ocaksutunTopplami = 0;
        int subatsutunToplami = 0;
        int martsutunTopplami = 0;

        // 3. Sadece tek bir for döngüsü yeterlidir. Bu döngü satırları gezecek( for (int satir = 0; ...) ).
        for (int i = 0; i < satislar.length; i++) {
            ocaksutunTopplami += satislar[i][hedefSutun];
        }

        for (int i = 0; i < satislar.length; i++) {
            subatsutunToplami += satislar[i][hedefSutun+1];
        }
        
        for (int i = 0; i < satislar.length; i++) {
            martsutunTopplami += satislar[i][hedefSutun+2];
        }

        System.out.println((hedefSutun + 1) + " . Sütunun (Ocak Ayı) toplam satışı: \t" + ocaksutunTopplami);
        System.out.println((hedefSutun + 2) + " . Sütunun (Şubat Ayı) toplam satışı: \t" + subatsutunToplami);
        System.out.println((hedefSutun + 3) + " . Sütunun (Mart Ayı) toplam satışı: \t" + martsutunTopplami);
        // 4. Döngünün içinde, matris[satir][hedefSutun] elemanına erişilir. Dikkat: sütun indeksi hep aynı!

        // 5. Bu eleman toplam ’a eklenir.
    }
}
