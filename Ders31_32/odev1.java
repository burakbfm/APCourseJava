package Ders31_32;

import javax.sound.midi.SysexMessage;

public class odev1 {
    public static void main(String[] var0) {
        //  1. ÖDEV 2'DEN 20'YE KADAR ÇİFT SAYILARı YAZDIR 
        //  2. ÖDEV 10'DAN GERİYE 1'ER SAYARAK GİDİN

        //  1. GÖREV 1'DEN 10'A KADAR TOPLAM
        int toplam = 0;

        for (int i = 1; i <=10;i++){
            toplam += i;
            System.out.println("Sayaç: " + i + " | Sayaç Sonrası Toplam " + toplam);    

        }
        //  2. GÖREV 1'DEN 10' KADAR ÇARPTIM TOPLAMINI

        int toplam2 = 1;

        for (int i = 1; i <=10;i ++) {
            toplam2 *= i; // toplam = toplam * i
            System.out.println("Gelen Sayı " + i + " Çarpıldıktan sonraki hal: " + toplam2);
        }

        //  3. 1'DEN 100'E KADAR OLAN SAYILARI EKRANA YAZDIRACAK BİR PROGRAM
        //      - SAYI 3'E TAM BÖLÜNÜYORSA SAYININ KENDİSİ YERİNE "Fizz" yazdırın.
        //      - SAYI 5'E TAM BÖLÜNÜYORSA SAYININ KENDİSİ YERİNE "Buzz" yazdırın.
        //      - SAYI HEM 3'E HEM DE 5'E TAM BÖLÜNÜYORSA "FizzBuzz" yazdırın.
        // for döngüsü + if else if else ve %

        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i);
            }
        }

                
    }
    
}
