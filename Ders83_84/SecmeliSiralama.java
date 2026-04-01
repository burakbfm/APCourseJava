package Ders83_84;

public class SecmeliSiralama {

    // SEÇMELİ SIRALAMA (SELECTION SORT) ALGORİTMASI
    // Algoritmanın Temel Fikri: Bir diziyi sıralamak için, her adımda dizinin geri kalanındaki en küçük (veya en büyük) öğeyi bulup, onu sıralanmış kısmın sonuna eklemek.
    public static void SecmeliSiralama(int[] dizi){
        System.out.println("Dizenin uzunluğu: " + dizi.length);
        for(int i = 0; i < dizi.length -1; i++) {
            int miniIndeks = i;

            for (int j = i + 1; j < dizi.length; j++ ){
                if (dizi[j] < dizi[miniIndeks]) {
                    miniIndeks = j;
                }
            }

            int gecici = dizi[miniIndeks];
            dizi[miniIndeks] = dizi[i];
            dizi[i] = gecici;
        }
    }
}
