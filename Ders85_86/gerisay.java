package Ders85_86;

public class gerisay {
    public static void gerisay(int n){
        if (n == 0) {
            System.out.print("BAŞLAT!");
        } else {
            System.out.println(n);
            gerisay(n - 1);
    }
    }
}
