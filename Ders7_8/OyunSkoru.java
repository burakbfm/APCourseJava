package DersKodlari.Ders7_8;

public class OyunSkoru {
    public static void main(String[] args) {
        int puan = 0;
        System.out.println("Oyun başladı! Mevcut Puan: " + puan);

        // Oyuncu bir altın topladı, +10 puan.
        puan += 10; // Kısaltılmış hali
        System.out.println("Altın toplandı! Mevcut Puan: " + puan);

        // Oyuncu bir canavar yendi, +50 puan.
        puan += 50; // Kısaltılmış hali
        System.out.println("Canavar yenildi! Mevcut Puan: " + puan);
        
        // Oyuncu bir tuzağa düştü, -20 puan.
        puan -= 20; // Kısaltılmış hali
        System.out.println("Tuzağa düşüldü! Mevcut Puan: " + puan);
    }
}