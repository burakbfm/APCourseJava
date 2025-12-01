package Ders27_28;

public class KargoHesaplama {
    public static void main(String[] var0) {
        // İç içe İf (Nested if)
        // iç içe if yapısının, bir if veya else bolğunun içinde başka bir if else yapısı yazmak

        // Anahtar Mantık: İçerisindeki if bloğu yalnzıca dışarıdaki if koşulunun true olması durumunda kontrol edilir
        // Dıştaki koşul false ise iteki bloğa bakılmaz

        // Okunabilirlik: Yazarken kodun girintili(inndentation) olmasının, okukabilrlik açısından önemi vardır
        
        // Senaryo:  Bir e-ticaret sitesi 500 TL üzeri alivşerilerinde kargoyu bedava yapıyor.
        // 500 TL altındaki alışverişlerde ise kargo ücreti 30 TL.
        // Ancak, eğer kullanıcı "VIP üye" ise 500 TL altındaki alışverişlerinde kargo ücreti 15 TL oluyor.

        double sepetTutari = 200.0;
        boolean vipUyeMi = false;
        double kargoUcreti;

        if (sepetTutari >= 500) {
            kargoUcreti = 0.0;
            System.out.println("500 TL ve üzeri alışverişlerde kargo ücretsizdir.");
        } else {
            System.out.println("Sepet tutarınız 500 TL Altında.");

            if (vipUyeMi == true) {
                kargoUcreti = 15.0;
                System.out.println("VIP Üye olduğunuz için kargo ücreti 15.0 TL");
            } else {
                kargoUcreti = 30.0;
                System.out.println("Standart kargo ücreti işlendi: 30.0 TL");
            }
        }

        double toplamOdeme = sepetTutari + kargoUcreti;
        System.out.println("Toplam Ödenecek Tutar: " + toplamOdeme + " TL");
    }
    
    
}
