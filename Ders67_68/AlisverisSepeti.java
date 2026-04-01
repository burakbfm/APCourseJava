package Ders67_68;

import java.util.ArrayList;


public class AlisverisSepeti {
    public static void main(String[] var0) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Muz");
        liste.add("Elma");
        liste.add("Ekmek");
        liste.add("Çikolata");
        liste.add("Şeker");
        System.out.println("Orijinal Liste: " + liste);

        // Bir elemanı Değiştirme (set)
        liste.set(0,"Portakal");
        System.out.println("Orijinal Liste: " + liste);

        // Bir elemanı silme (remove)
        liste.remove(1);
       
        
        System.out.println("\n *** Listenin Son Hali ***");
        for (String urun : liste) {
            System.out.println("- " + urun);
        }

        // Integer'dan olulşan bir ArrayList oluşturun. İçine 1'den 10'a kadar sayı ekleyin.
        // Ardından standart bir for döngüsü kurarak listeyi gezin.
        // Döngü içinde if ile bir sayının çift olup olmadığını kontrol edin.
        // Eğer sayı çift ise op sayıyı .set() metodu ile o sayıyı 0 ile değiştirin
        // (1,2,3,4,5,6,7,8,9,10) normal çıktı
        // (1,0,3,0,5,0,7,0,9,0) beklenen çıktı
    }
}
