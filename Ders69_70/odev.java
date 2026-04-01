package Ders69_70;

import java.util.ArrayList;

public class odev {
    public static void main(String[] var0) {
        // Integer'dan olulşan bir ArrayList oluşturun. İçine 1'den 10'a kadar sayı ekleyin.
        // Ardından standart bir for döngüsü kurarak listeyi gezin.
        // Döngü içinde if ile bir sayının çift olup olmadığını kontrol edin.
        // Eğer sayı çift ise op sayıyı .set() metodu ile o sayıyı 0 ile değiştirin
        // (1,2,3,4,5,6,7,8,9,10) normal çıktı
        // (1,0,3,0,5,0,7,0,9,0) beklenen çıktı



        // for (int i = 0; i < liste.size(); i++) {
        //     if (liste.get(i) % 2 == 0) {
        //         liste.set(i, 0);
        //     }
        // }
        // System.out.println("Düzenlenmiş Liste: " + liste);

        //int[] notlar = new int[5];
        // .add()
        // .size()
        // .get()
        // .remove(i)
        // 1. import gerekliliği
        // 2. <> (generics) kullanımı
        // .lenght yerine .size() metodu gibi
        // [i] yerine .get(i)

        // Çift sayı gördüğünz zaman onu silin.
        // (1,2,3,4,5,6,7,8,9,10) normal çıktı
        // (1,3,5,7,9) beklenen çıktı
        ArrayList<Integer> liste = new ArrayList<>();
        
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        System.out.println("Orijinal Liste: " + liste);

        System.out.println("*********************************************");
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) % 2 == 0) {
                liste.remove(i);
            }
        }
        
        System.out.println("Düzenlenmiş Liste: " + liste);


        // LİSTEYİ TERSTEN OKUMAMIZ GEREKLİ
        for (int i =liste.size() - 1;i >=0; i--) {
            if (liste.get(i) % 2 ==0) {
                liste.remove(i);
            }
        }
    }
}
