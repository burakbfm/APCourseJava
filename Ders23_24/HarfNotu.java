

public class HarfNotu {
    public static void main(String[] args) {
        /*
        if (kosul) {
            //koşul doğruysa
        } else if (kosul2) {
            // koşul yanlışsa ama koşul2 doğruysa
        } else if (koşul3) {
            // koşul2 yanlışsa ama koşuş3 doğruysa
        } else {
            // koşullar doğru değilse burası çalışır
        }
         */

        int not = 95;
        System.out.println("Sayısal Not: " + not);

        if (not >= 90) {
            System.out.println("Harf Notu: A (Pekiyi)" + "| TAM not almak için gereken ekstra puan: " + (100 - not));
        } else if (not >= 80) {
            System.out.println("Harf Notu: B (İyi)" + "| A almak için gereken ekstra puan: " + (90 - not));
        } else if (not >= 70) {
            System.out.println("Harf Notu: C (Orta)" + "| B almak için gereken ekstra puan: " + (80 - not));
        } else if (not >= 60) {
            System.out.println("Harf Notu: D (Geçer)" + "| C almak için gereken ekstra puan: " + (70 - not));
        } else {
            System.out.println("Harf Notu: F (Kaldı)" + "| D almak için gereken ekstra puan: " + (60 - not));
        }
    }
    
}
