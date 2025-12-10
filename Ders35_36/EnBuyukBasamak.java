package Ders35_36;

public class EnBuyukBasamak {
    public static void main(String[] var0) {
        // VERİLEN SAYININ HANGİ BASAMAIĞININ DAHA BÜYÜK OLDUĞUNU BULUN 4785
        // enBuyuk adında bir değişken oluştur
        // Bu değişkene dizinin ilk elemanını veya daha küçük bir değer ata
        // dizinin geri kalan elemanları üzerinde gezinecek bir döngü kur
        // Döngünün içinde o anki elemanı enBuyuk değişkeniyle karşılaştır
        // Eğer o anki eleman enBuyukten daha büyükse  enBuyuk değişkenin değerini o anki elemanın değeriyle gücnelle
        // Döngü bittiğinde enBuyuk değişkeni aradığımız sonucu tutyor olacaktır.

        int sayi = 4925;
        int orijinalsayi = sayi;
        int enBuyuk = -1;

        while (sayi > 0) {
            int basamak = sayi % 10;
            if (basamak > enBuyuk) {
                enBuyuk = basamak;
            }
            sayi /= 10; // sayi = sayi / 10;

        }

        System.out.println(orijinalsayi + " sayısının en büyük basamağı: " + enBuyuk);
    }   
}
