package Ders79_80;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sosyalmesafe {
    // Senaryo: “Bir sinema salonunun koltuk düzenini bir int[][] matrisi ile temsil ediyoruz. 0 ‘lar
    // boşkoltuğu, 1 ’ler dolu koltuğu anlamına geliyor. Bir ’sosyal mesafe’kuralı uygulamamız
    // gerekiyor.”

    // Görev: “Parametre olarak bir hedefSatir numarası alan bir metot yazın. Bu metot, belirtilen
    // satırı gezmeli ve yan yana dolu olan iki koltuk( 1, 1 durumu) bulduğunda, bu çiftin ikinci
    // koltuğunu kural gereği boşaltmalı (değerini 0 yapmalı).”

    // Algoritma Tasarımı:
    // 1. Sadece belirli bir satırı gezeceğimiz için, tek bir for döngüsü yeterlidir. Bu döngü, o
    // satırın sütunlarını gezecek.

    // 2. Döngü içinde, o anki koltuğu ( salon[hedefSatir][j] ) ve hemen sağındaki komşusunu
    // ( salon[hedefSatir][j+1] ) kontrol etmeliyiz.

    // 3. Sınır Kontrolü: j+1 ’e baktığımız için, döngümüz son elemana kadar gidemez, yoksa
    // ArrayIndexOutOfBoundsException hatası alırız! Döngü sutunSayisi - 1 ’e kadar
    // gitmelidir.

    // 4. if (salon[hedefSatir][j] == 1 && salon[hedefSatir][j+1] == 1) koşulunu kontrol et.

    // 5. Eğer koşul doğruysa, ikinci koltuğun değerini değiştir: salon[hedefSatir][j+1] = 0; .

    // Bu algoritmayı öğrencilerle birlikte kodlayın ve bir test senaryosu ile çalıştırın.
    public static void sosyalMesafeUygula(int[][] salon, int hedefSaatir) {
        for (int j = 0; j < salon[hedefSaatir].length; j++) {
            if (salon[hedefSaatir][j] == 1 && salon[hedefSaatir][j+1] == 1) {
                salon[hedefSaatir][j+1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] sinemasalonu = { {0,1,1,0}, {1,1,1,0}, {0,0,1,1}};
        int satir = 2;
        System.out.println("Önce: \t" + Arrays.toString(sinemasalonu[satir]));
        sosyalMesafeUygula(sinemasalonu, satir);
        System.out.println("Sonra: \t" + Arrays.toString(sinemasalonu[satir]));




        System.out.println("**********************************");



        int[][] sinemasalonu2 = {
            {0, 1, 0, 0, 1, 1, 0},
            {1, 0, 1, 1, 0, 0, 1},
            {0, 0, 1, 0, 1, 1, 1},
            {1, 1, 0, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 1}
        };

        int satir2 = 2;
        System.out.println("2. Sinema Salonu Önce: " + Arrays.toString(sinemasalonu2[satir2]));
        sosyalMesafeUygula(sinemasalonu2, satir2);
        System.out.println("2. Sinema Salonu Sonra: " + Arrays.toString(sinemasalonu2[satir2]));
    }
}


