

public class TekMiCiftMi {
    public static void main(String[] args) {
        /* 
        if (kosul) {
            KOŞUL true ise bu blok çalışır
        } else {
            KOŞUL false ise bu blok çalışır
        }
        */

        // else İFADESİ KENDİ BAŞINA BİR KOŞUL () PARANTEZİ ALMAZ if içinde durum false ise otomatik
        int sayi = 87659;
        System.out.println("Kontrol Edilen Sayı: " + sayi);
        // Bir sayının 2'ye bölümünden kalan 0 ise, o sayi çifttir
        if (sayi % 2 == 0) {
            // Koşul true ise (kalan 0 ise) burası çalışır
            System.out.println("Bu sayı ÇİFTTİR.");
        } else {
            // Koşul false ise (kalan 0 değilse) burası çalışır.
            System.out.println("Bu sayı TEKTİR.");
        }

        int ogrenciNotu = 51;
        int gecmeNotu = 50;

        System.out.println("Öğrencinin Notu: " + ogrenciNotu);
        //KOŞULU KONTROL EDİCEZ
        // "ogrenciNotu" "gecmeNotu"'ndan büyük mü ya da eşit mi 
        if (ogrenciNotu >= gecmeNotu) {
            System.out.println("Tebrikler, dersi geçtiniz");
        } else {
            System.out.println("Malesef, dersten kaldınız.");
        }

    }
    
}
