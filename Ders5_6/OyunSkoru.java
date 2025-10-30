package DersKodlari.Ders5_6;

public class OyunSkoru {
public static void main(String[] args) {
        // Başlangıçta puanımız 0 olsun. Bu ilk değer atamasıdır (initialization).
        int puan = 0;
        System.out.println("Oyun başladı! Mevcut Puan: " + puan);

        // Oyuncu bir altın topladı, +10 puan.
        puan = puan + 10;
        System.out.println("Altın toplandı! Mevcut Puan: " + puan);

        // Oyuncu bir canavar yendi, +50 puan.
        puan = puan + 50;
        System.out.println("Canavar yenildi! Mevcut Puan: " + puan);

        // Oyuncu bir tuzağa düştü, -20 puan.
        puan = puan - 20;
        System.out.println("Tuzağa düşüldü! Mevcut Puan: " + puan);
        
        System.out.println("Oyun bitti! Final Puanı: " + puan);
    }
}