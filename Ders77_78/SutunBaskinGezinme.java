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


    }


}
