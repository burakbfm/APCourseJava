package Ders75_76;

public class Ilk2DDizim {
    public static void main(String[] var0) {

        // Sözdizimi: (Syntax)
        // VeriTipi[][] diziAdi = new VeriTipi[SatirSayisi][SutunSayisi];
        // sinemasalonu = new int[5][10]; // 5 satır ve 10 sütunlu bir sinema salonu oluşturduk.


        // Bildirme:    veriTipi[][] diziAdi; (int[][] sinemasalonu;)
        // Oluşturma:    diziAdi = new veriTipi[SatirSayisi][SutunSayisi]; (sinemasalonu = new int[5][10];)
        // Erişim:      diziAdi[SatirIndeksi][SutunIndeksi]; (sinemasalonu[0][0];) - sinemasalonu[2}[5];

        // Boyut Öğrenme: Satır sayısı: diziAdi.length; (sinemasalonu.length;) - Sütun sayısı: diziAdi[0].length; (sinemasalonu[0].length;)


        // 2 satır ve 3 sütundan oluşan bir 2D dizi oluşturalım.1
        int[][] matris = new int[2][3];

        // 1. Satır, 2. sütuna (indeks 1 ve 2) bir değer atayalım
        matris[1][2] = 100;

        System.out.println("Matrisin satır sayısı: " + matris.length);
        System.out.println("Matrisin sütun sayısı: " + matris[0].length);

        // Atadığımız değeri ekrana yazalım.
        System.out.println("matris[1][2] değeri: " + matris[1][2]);
        
        // Atanmamış bir elemanın varsayılan değeri 0'dır.
        System.out.println("matris[1][0] değeri: " + matris[0][0]);
        
        
        // 3x3'lük bir "tic-tac-toe" oyunu yapın. String dizi oluşturun manuel olarak birkaçten x ve o ataması yapın (tahta[1][1] hangi karakter var)
        String[][] tiktaktoe = new String[3][3];
        tiktaktoe[1][2] = "X";
        tiktaktoe[2][2] = "O";
        tiktaktoe[2][1] = "O";

        System.out.println("tiktaktoe[1][1] değeri: " + tiktaktoe[1][1]);
    }
    
}
