package Ders27_28;

public class HayvanTahmini {
    public static void main(String[] var0) {
        // Aklımızda tuttuğumuz hayvanın özellikleri
        // (Bu değerleri değiştirerek farklı sonuçlar alabiliriz)
        boolean dortAyakliMi = true;
        boolean evcilMi = true;

        System.out.println("Aklımdaki hayvanı tahmin etmeye çalışıyorum...");

        if (dortAyakliMi) {
            if (evcilMi) {
                System.out.println("Tahminim: Kedi veya Köpek");
            } else {
                System.out.println("Tahminim: Aslan veya Kaplan");
            }
        } else {
            if (evcilMi) {
                System.out.println("Tahminim: Papağan veya Muhabbet Kuşu");
            } else {
                System.out.println("Tahminim: Kartal veya Yılan");
            }
        }
    }
    
}
