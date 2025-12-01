package Ders29_30;

public class odev {
    public static void main(String[] var0) {  
        // Ödev:
        // while döngüsü kullanarak 2’den 20’ye kadar olan çift sayıları (2 ve 20 dahil) ekrana yazdıran bir
        // program yazmalarını isteyin. Bu ödev, güncelleme adımının her zaman ++ olmakzorunda
        // olmadığını ( sayac += 2; gibi) anlamalarını sağlar.

        int sayac = 2;
        while (sayac <= 20){
            System.out.println(sayac);
            sayac += 2;
        }

    }
}
