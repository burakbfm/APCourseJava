package Ders29_30;

public class SayacProgrami {
    public static void main(String[] var0) {
        // Bir döngünün üç temel bileşenini vardır: "başlatma", "koşul" ve "arttırma/azaltma"(gücnelleme).)
        // -diği sürece belirli bir kod bloğunu tekrar tekrar çalıştırmak için kullanılır.
        // (koşul) -> treu olduğu sürece döngü devam eder.

        // DOĞRU BİR DÖNGÜNÜN 3 ALTIN KURALI:

        // 1. Başlatma(Intiallization): Döngü sayacını başlatmak için bir değişken tanımlayın ve başlangıç değerini atayın.
        // int sayac = 1;

        // 2. Koşul(Condition): Döngünün ne zaman devam edeceğini belirten bir koşul ifadesi yazın.
        // sayac <= 5;

        // 3. Güncelleme(Update): Döngü sayacını her döngü turunda güncelleyin (arttırma veya azaltma).
        // sayac++;


        // ÖRNEK 
        // 1. Başlatma döngü değişkenimiz 1'den başlıyor.
        int sayac = 1; 

        // 2. Koşul: Sayaç 10'dan küçük veya eşit olduğu sürece döngü devam edecek.
        while (sayac <=10) {
            System.out.println("Naber " + sayac);

            // 3. Güncelleme: Döngü sayacını 1 artırıyoruz.
            // Bu satırı unutursak, sonsuz döngüye gireriz.
            sayac++;
            // sayac += 1;
            // sayac = sayac + 1;
        }

        System.out.println("Döngü Bitti");


    }
    
}
