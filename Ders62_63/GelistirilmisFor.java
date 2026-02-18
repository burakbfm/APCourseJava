package Ders62_63;

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
    }
    
}
