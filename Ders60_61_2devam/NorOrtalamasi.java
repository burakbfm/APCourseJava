package Ders60_61_2devam;

public class NorOrtalamasi {
    public static void main(String[] var0) {
        // int[] notlar = new int[5]
        int[] notlar = {85, 100, 90, 77, 65, 87, 41, 52,85, 100, 90, 77, 65, 87, 41, 52,85, 100, 90, 77, 65, 87, 41, 52,85, 100, 90, 77, 65, 87, 41, 52};
        // notlar[0] = 85
        // notlar[1] = 100
        // notlar[2] = 90
        //...
        System.out.println("********** SINIF NOTLARI **********");
        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.println((i+1) + ". Öğrencinin Notu: " + notlar[i]);
            toplam += notlar[i];
            // toplam = toplam + notlar[i]
        }

        
        double ortalama = (double)toplam / notlar.length;
        
        System.out.println("***********************************");
        System.out.println("Notların Toplamı:  " + toplam);
        System.out.println("Sınıfın Ortalaması: " + ortalama);

    }
    
}
