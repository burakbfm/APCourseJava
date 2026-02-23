package Ders61_62_2devam;

public class ilkDizim {
    public static void main(String[] var0) {
        // int not = 5;
        // [] bu değişkeni bir diziye(dolaba) çevirir 
        // new int[x] x'e yazılan değer kadar dizi elemanı oluşturur. (dolaba göz açarız.)
        
        int[] notlar = new int[5];
        
        notlar[0] = 85;
        notlar[1] = 78;
        notlar[2] = 64;
        // notlar[5] = 24; // burda hata alırız çünkü 5 gözlü bir dolabımız var ama biz 6. göze atama yapmaya çalışıyoruz
        
        System.out.println("2. Öğrencinin notu: " + notlar[1]); // 78

        System.out.println("4. Öğrencinin notu: " + notlar[3]); // 0 en düşük pozitif değerin atamasını yapıcak

        // System.out.println("6. Öğrencinin notu: " + notlar[5]); // burda hata alırız çünkü 5 gözlü bir dolabımız var ama biz 6. gözü çağırmaya çalışıyoruz



        // GÖREV | En sevdiğiniz 3 filmin adını tutan bir Strring dizisi oluşturun ve dizinin 2. elemanını ekrana yazdırın.

        String[] filmer = new String[5];

        filmer[0] = "The Wepeons";
        filmer[1] = "The Proposel";

        System.out.println("En sevdiğim 2. film " + filmer[1]);




    }
}
