package Ders77_78;

public class SutunBaskinGezinme {
    public static void main(String[] var0) {

        int[][] matris = {{1,2,3},{4,5,6}};

        System.out.println("--- Sütun-Baskın Gezinme ---");

        for (int sutun = 0; sutun < matris[0].length; sutun++) {

            for (int satir = 0; satir < matris.length; satir++) {
                System.out.println("matris[" + satir +"][" + sutun + "] = " + matris[satir][sutun]);
            }

        }

        // int[][] matris = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120} };

       
 // 1 ) int değerlerinden oluşan bir 2D dizi verin. Öğrencilerden, iç içe for döngülerini kullanarak bu
        // dizideki tüm elemanların toplamını bulan bir program yazmalarını isteyin. (Bu, “biriktirici”
        // algoritmasının 2D diziye uygulanmasıdır).

        int[][] matris2 = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120} };

        int toplam = 0;

        // for (int i = 0; i < matris2.length; i++) {
        //     for (int j = 0; j < matris2[0].length; j++) {
        //         toplam += matris2[i][j];
        //     }
        // }

        for (int i =0; i < matris2[0].length; i++) {
            for (int j = 0; j < matris2.length; j++) {
                toplam += matris2[j][i];
            }
        }
        System.out.println(toplam);

        // 2 ) Öğrencilerden, “tüm elemanların toplamını bulan” ödevlerini bu sefer sütun-baskın dolaşma
        // kullanarakyeniden yazmalarını isteyin.Sonucun yine aynı çıkması gerektiğini görmeleri, bu
        // algoritma için gezinme sırasının sonucu değiştirmediğini anlamalarını sağlayacaktır.

    }


}
