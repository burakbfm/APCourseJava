
package Ders21_22;

public class NotKontral {
    public static void main(String[] args) {
        /* BOOLEN İFADELERİ VE KARŞILAŞTIRMA OPERATÖRLERİ
        == eşitlik (eşit mi değil mi)
        != eşit değil mi diye soruyor
        > büyüktür işareti
        < küçüktür
        >= büyük eşit
        <= küçük eşit"
         */

        /*
        İF (KOŞUL) {
            KOŞUL DOĞRUYSA ÇALIŞACAK KODLAR
        }
         */
        int ogrenciNotu = 49;
        int gecmeNotu = 50;

        System.out.println("Öğrencinin Notu: " + ogrenciNotu);
        //KOŞULU KONTROL EDİCEZ
        // "ogrenciNotu" "gecmeNotu"'ndan büyük mü ya da eşit mi 
        if (ogrenciNotu >= gecmeNotu) {
            System.out.println("Tebrikler, dersi geçtiniz");
        }
             
        System.out.println("Program Sona erdi");
    }
    
}
