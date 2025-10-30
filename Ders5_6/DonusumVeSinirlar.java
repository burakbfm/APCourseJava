package DersKodlari.Ders5_6;

public class DonusumVeSinirlar {
    public static void main(String[] args) {
        // Casting Örneği
        int toplamNot = 290; // 3 sınav notu toplamı
        int sinavSayisi = 3;

        // Yanlış hesaplama (tam sayı bölmesi)
        int yanlisOrtalama = toplamNot / sinavSayisi;
        System.out.println("Yanlış Ortalama (int): " + yanlisOrtalama);

        // Doğru hesaplama (casting ile)
        double dogruOrtalama = (double)toplamNot / sinavSayisi;
        System.out.println("Doğru Ortalama (double): " + dogruOrtalama);

        // Integer Sınırları
        System.out.println("\n--- Integer Sınırları ---");
        System.out.println("En Büyük int Değeri: " + Integer.MAX_VALUE);
        System.out.println("En Küçük int Değeri: " + Integer.MIN_VALUE);
        
        // Overflow Örneği
        int enBuyukSayi = Integer.MAX_VALUE;
        System.out.println("En büyük sayıya 1 eklersek: " + (enBuyukSayi + 1));
    }
}