package Ders63_64;

public class GelistirilmisFor {
    public static void main(String[] var0) {
        // String takimlar[] = new String[4];
        // takimlar[0] = "Galatasaray";
        //  ...

        String[] takimlar = {"Galatasaray", "Fenerbahçe", "Beşiktaş", "Trabzonspor"};

        // --- Standart for döngüsü ile yazdırma ---
        System.out.println("--- Standart Döngü ---");
        for (int i = 0; i < takimlar.length; i++) {
            System.out.println(takimlar[i]);
        }
        System.out.println("--- Geliştirilmiş for döngüsü ile yazdırma ---");
        // --- Geliştirilmiş for döngüsü ile yazdırma ---
        for (String takim : takimlar) {
            System.out.println(takim);
        }

        // Dizinin elemanlarını değiştirmek, diziyi tersten gezmek, sadece çift/tek indesksleri işlemek.
        // Aynı anda birdan fazla elemanı karşılaştırmak gibi indekse ihtiyaç duyulan alanlarda kullanılamaz.

        // ÖDEV:
        //String tipinde isimleri tutan bir dizi oluştursunlar. Geliştirilmiş for döngüsü kullanarak dizideki
        // tüm isimleri “Merhaba, [İsim]!” formatında ekrana yazdıran bir program yazsınlar.
    }
    
}
