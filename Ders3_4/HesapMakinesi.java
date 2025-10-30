package DersKodlari.Ders3_4;

public class HesapMakinesi {
public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 4;

        System.out.println("--- Tam Sayı İşlemleri ---");
        System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
        System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));

        // Dikkat! Tam sayı bölmesi
        System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2)); // Sonuç 2 olacak

        // Modulus (Kalan)
        System.out.println(sayi1 + " % " + sayi2 + " = " + (sayi1 % sayi2)); // Sonuç 2 olacak

        System.out.println("\n--- Ondalıklı Sayı İşlemleri ---");
        double ondalikliSayi1 = 10.0;
        double ondalikliSayi2 = 4.0;
        
        // Doğru bölme sonucu
        System.out.println(ondalikliSayi1
        + " / " + ondalikliSayi2 + " = " + (ondalikliSayi1 / ondalikliSayi2)); // Sonuç 2.5 olacak
    }
}