package Ders89_90;

public class selectionsort {
    public static void main(String[] var0) {
        // SEÇMELİ SIRALAMA (Selection Sort))
        int[] dizi = {11, 5, 548, 75, 12, 2, 75, 84, 145, 25, 54};
        
        for (int i = 0; i < dizi.length - 1 ; i++) {
            int minIndeks = i;
            for (int j = i +1; j < dizi.length; j++) {
                if (dizi[j] < dizi[miIndeks]) {
                    minIndeks = j; // en küçüğü bulduk 
                }
            }
            // Swap (Yer değiştirme)
            int gecici = dizi[minIndeks]
            dizi[minIndeks] = dizi[i];
            dizi[i] = gecici;
        }

        // EKLEMELİ SIRALAMA (Insertion Sort) - "Kartları araya kat""
        for (int i = 1; dizi.length; i++) {
            int anahtar = dizi[i];
            int j = i -1;
            while (j > 0 && dizi[j] > anahtar){
                dizi[j+1] = dizi[j]; // Kaydır
                j--;
            }
            dizi[j+1] = anahtaar; // Doğru Yere Yerleştir.
        }
    }
}