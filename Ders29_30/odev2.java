package Ders29_30;

public class odev2 {
    public static void main(String[] var0) {
        // Bir sayının faktöriyelini hesaplayan bir program yazmalarını isteyin (Örn: 5! = 5 * 4 * 3 * 2 * 1). Bu,
        // toplama yerine çarpma kullanılan bir biriktirici (aggregator) kalıbıdır.Toplam değişkenini 0’dan
        // başlattığımız gibi, çarpım değişkenini etkisiz eleman olan 1’den başlatmaları gerektiğini ipucu
        // olarakverebilirsiniz.

        int toplam = 1;
        int sayac = 1;

        while (sayac <= 5) {
            toplam *= sayac; // toplam = toplam * sayac;
            sayac++; // sayac = sayac + 1;
        }
        System.out.println("1'den 5'e kadar olan sayıların Çarpımı: " + toplam);


    }
}
1