package Ders65_66;

import java.util.Arrays;
public class DiziTersCevirme {
    public static void main(String[] var0) {
        int[] sayilar  = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Orijinal Dizi: " + Arrays.toString(sayilar));

        for (int i =0; i < (sayilar.length/2);i++) {
            int gecici = sayilar[i];
            sayilar[i] = sayilar[sayilar.length -1-i];
            sayilar[sayilar.length -1-i] = gecici;
        }

        System.out.println("Ters Çevrilmiş Dizi: " + Arrays.toString(sayilar));
        
    }
}
