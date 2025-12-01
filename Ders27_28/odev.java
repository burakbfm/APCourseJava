package Ders27_28;

public class odev {
    public static void main(String[] var0) {
        // Bilet Fiyatı Hesaplayıcı: Bir sinema bileti fiyatı hesaplayan program yazmalarını isteyin.

        // -Normal bilet fiyatı: 100 TL.

        // -12 yaşından küçükler veya 65 yaşından büyükler için %50 indirimli.

        // -Ek olarak,eğer gün “Salı” ise, indirimli fiyattan (veya normal fiyattan) ekstra 20 TL “Halk Günü
        // İndirimi” yapılsın.

        // -Program, int yas ve String gun değişkenlerine göre son bilet fiyatını hesaplayıp ekrana
        // yazdırmalıdır. Bu ödev, hem mantıksal operatörleri ( || ) hem de iç içe if yapılarını
        // kullanmayı gerektirir.

        int yas = 70;
        String gun = "Salı";
        double biletFiyati = 100.0;

        if (yas < 12 || yas > 65) {
            if (yas < 12) {
                System.out.println("12 YAŞINDAN KÜÇÜK OLDUĞUNUZ İÇİN %50 İNDİRİM UYGULANDI.");
                biletFiyati *= 0.5;
            } else {
                System.out.println("65 YAŞINDAN BÜYÜK OLDUĞUNUZ İÇİN %50 İNDİRİM UYGULANDI.");
                biletFiyati *= 0.5;
            }
        } else {
            if (yas >= 12) {
                System.out.println("12 YAŞINDAN BÜYÜK OLDUĞUNUZ İÇİN İNDİRİM UYGULANMADI.");
            } else {
                System.out.println("65 YAŞINDAN KÜÇÜK OLDUĞUNUZ İÇİN İNDİRİM UYGULANMADI.");
            }
        }

        if (gun.equals("Salı")) {
            biletFiyati -= 20.0;
            System.out.println("BUGÜN SALI, HALK GÜNÜ İNDİRİMİ UYGULANDI.");

        } else {
            System.out.println("BUGÜN SALI DEĞİL, HALK GÜNÜ İNDİRİMİ UYGULANMADI.");
        }

        System.out.println("Ödenecek Bilet Fiyatı: " + biletFiyati + " TL");

    }
    
}
