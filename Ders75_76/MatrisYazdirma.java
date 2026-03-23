package Ders75_76;

public class MatrisYazdirma {
    public static void main(String[] var0) {

        // Satır-Baskın Dolaşma (Row-Major Traversal)
        // 3x3'lük bir "tic-tac-toe" oyunu yapın. String dizi oluşturun manuel olarak birkaçten x ve o ataması yapın (tahta[1][1] hangi karakter var)
        String[][] tiktaktoe = new String[3][3];

        tiktaktoe[0][0] = "O";
        tiktaktoe[0][1] = "O";
        tiktaktoe[0][2] = "O";

        tiktaktoe[1][0] = "X";
        tiktaktoe[1][1] = "X";
        tiktaktoe[1][2] = "O";

        tiktaktoe[2][0] = "X";
        tiktaktoe[2][1] = "O";
        tiktaktoe[2][2] = "X";


        // System.out.println("tiktaktoe[1][1] değeri: " + tiktaktoe[1][1]);

        for (int i =0; i < tiktaktoe.length; i++) {

            for (int j = 0; j < tiktaktoe[i].length; j++){

                System.out.print(tiktaktoe[i][j] + "\t");
                
            }

            System.out.println();
        }
    }
    
}