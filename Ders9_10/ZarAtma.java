package DersKodlari.Ders9_10;

public class ZarAtma {
public static void main(String[] args) {
        // int sayi = (int)(Math.random() * (max - min + 1)) + min;
        
        // min = 1, max = 6
        // Formül: (int)(Math.random() * (6 - 1 + 1)) + 1
        // Basitleştirilmiş: (int)(Math.random() * 6) + 1

        int zar1 = (int)(Math.random() * 6) + 1;
        int zar2 = (int)(Math.random() * 6) + 1;
        int toplam = zar1 + zar2;
        
        System.out.println("Birinci zar atıldı: " + zar1);
        System.out.println("İkinci zar atıldı: " + zar2);
        System.out.println("Zarların toplamı: " + toplam);
    }
}

