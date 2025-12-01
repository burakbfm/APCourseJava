package Ders29_30;

public class ToplamaHesaplayici {
    public static void main(String[] var0) {
        // PROBLEM:
        // 1'den 100'e kadar olan sayıları toplayan bir program yazın.

        // MANTIK
        // Bu problemöi çözmek için iki değişkene ihtiyacımız var:
        // 1. Toplamı tutacak bir değişken (örneğin, toplam)
        // 2. Döngü sayacı (örneğin, sayac)

        int toplam = 0;
        int sayac = 1;

        while (sayac <= 10) {
            toplam += sayac; // toplam = toplam + sayac;

            System.out.println("Sayaç: " + sayac + ", Anlık Toplam: " + toplam);

            sayac++; // sayac = sayac + 1;
        }
        System.out.println("----------------------------------------");
        System.out.println("1'den 10'e kadar olan sayıların toplamı: " + toplam);

        // "Biriktirici" (Accumulator) kalıbı, dizilerde, ArtrayList'lerde ve veri analizleridne sürekli karşınıza çıkar.
        // Bu yüzden mantığının tam olarak anlaşılması önemlidir.
    }
    
}
