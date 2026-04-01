package Ders65_66;

public class NotAnalizi {
    public static void main(String[] var0) {
        // Bir sınıfın vize notlarını bir int dizisi içinde tutalım
        int[] notlar = {85, 100, 90, 77, 65, 87, 41, 52, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41, 100, 90, 77, 65, 87, 41};

        // 1. Sınıfın not ortalamı kaçtı - biriktiri ve for dönüsü
        // int toplam = notlar[0] + notlar[1] + notlar[2] .....  notlar[7]

        // int toplam = 0;
        // for (int i = 0; i < notlar.length; i++) {
        //     toplam += notlar[i];
        // }
        // System.out.println(toplam / notlar.length);

        int toplam = 0;
        for (int not : notlar) {
            toplam +=not;
        }
        double ortalama = (double)toplam / notlar.length;
        System.out.println(notlar.length + " Öğrencinin not toplamı: " + toplam + " | Öğrencilerin not ortalaması: " + ortalama);

        // 2. En yüksek kaçtır min/max  
        int enYuksek = notlar[0];
        for (int not : notlar) {
            if (not > enYuksek) {
                enYuksek = not;
            }
        }

        System.out.println("En yüksek not: " + enYuksek);

        // 3. En düşük not kaçtır min/max
        int enDusuk = notlar[0];
        for (int not : notlar) {
            if (not < enDusuk) {
                enDusuk = not;
            }
        }

        System.out.println("En Düşük not: " + enDusuk);
        // 4. Sınıfta 100 tam puan alan var mı ?
        boolean yuzAlanVar = false;
        for (int not : notlar) {
            if (not == 100) {
                yuzAlanVar = true;
                break;
            }
        }
        System.out.println("100 Tam puan alan var mı: " + yuzAlanVar);

        // 5. Sınıfta kaç adet 100 alan var.

        int yuzalansayisi = 0;

        for (int not : notlar) {
            if (not == 100) {
                yuzalansayisi++;
            }
        }
        System.out.println("100 Alan öğrenci sayısı: " + yuzalansayisi);

        // 6. Sınıftaki başarı oranları
        int kotu = 0;
        int orta = 0;
        int iyi = 0;
        int cokiyi = 0;

        for (int not : notlar) {
            if ( 100 >= not && not >=85) {  
                cokiyi++;
            }
            else if (84 >= not && not >=70) {
                iyi++;
            }
            else if (69 >= not && not >=50) {
                orta++;
            }
            else {
                kotu++;
            }

        }
        System.out.println("Sınıfta Çok iyi alan öğrenci sayısı : " + cokiyi + "\nSınfta İyi olan öğrenci sayısı: "
        + iyi + "\nSınfta Orta olan öğrenci sayısı: " + orta + "\nSınfta Kötü olan öğrenci sayısı: "+ kotu);
    }    
}
