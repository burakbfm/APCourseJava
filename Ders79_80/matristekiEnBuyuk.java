package Ders79_80;

public class matristekiEnBuyuk {
    public static void main(String[] var0) {
        int[][] sicaklilar = {{25, 28, 29}, {30, 32, 29}, {28, 26, 32}, {28, 26, 32}, {28, 26, 32}};

        int enYuksekSicaklik = sicaklilar[0][0];

        for (int i = 0; i < sicaklilar.length; i++) {
            for (int j = 0 ; j < sicaklilar[0].length; j++) {
                if (sicaklilar[i][j] > enYuksekSicaklik) {
                    enYuksekSicaklik = sicaklilar[i][j];
                }
            }
        }

        System.out.println("Tüm zamanların en yüksek sıcaklığı: " + enYuksekSicaklik);

    }
}
