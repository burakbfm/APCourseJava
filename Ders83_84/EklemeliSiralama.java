package Ders83_84;

public class EklemeliSiralama {
    public static void EklemeliSiralama(int[] dizi) {

        // diziyi zihninizde sıralı ve sıralanmamış olarak ikiye ayırın
        // sıralanmış bölümün ilk elemanını elinize alın (bu anahtar değer)
        // sıralı bölümde sağdan sola doğru bakın
        // sıralı bölümdeki elemenlar anahtar değerimizden büyük olduğu sürece onları birer sağa kaydırın.
        // doğru yeri bulduğunuzda anahtar deeğeri oraya yerleştirin
        // sıralanmamış bölümdeki bir sonraki elemanı alın ve adımları tekrarlayın

        // Dış döngü, sıralanmamış bölümün ilk elamanını sçer
        for (int i = 1; i < dizi.length; i++) {
            int anahtar = dizi[i]; // Sıralı bölüme eklenek eleman
            int j = i - 1;

            // İç döngü anahtar'dan büyük olan elemanları bir sağa kaydırır.

            while (j >=0 && dizi[j] > anahtar) {
                dizi[j + 1] = dizi[j];
                j = j - 1;
            }
            dizi[j + 1] = anahtar; // anahatarı doğru yerine ekle.
        }

    }


    
}
