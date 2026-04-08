package Ders81_82;

public class ikilibulma {
    public static void main(String[] var0) {
        int[] uzunlistem = {2, 5, 7, 9, 11, 25, 36, 45, 78, 154, 215, 316, 548, 1024, 2568, 9876};

        int aradigimlezzet = 1024;

        int konum = IkiliArama.IkiliArama(uzunlistem, aradigimlezzet);

        System.out.println(konum);

        // İKİLİ ARAMA NE KADAR FAYDALI OLSA DA EĞER LİSTE SIRALI DEĞİLSE DÜZGÜN ÇAIŞMAZ 
    }
    
}
