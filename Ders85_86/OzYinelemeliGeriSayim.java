package Ders85_86;

public class OzYinelemeliGeriSayim {
    // Temel Durum(Base Case): Problemin doğrudan çözülebildiği en basit durumdur.
    // Kendi kendi yenilemenin durduğu noktadır. Bunun olmadığı senaryoda program kendini sürekli çağırır StackOverFlow hatası alırız.

    // Özyinelemeli Adım (Recursive Step): problemi kendisinin daha basit bir versiyonuna indirger ve metodu o basit
    // versiyon için tekrar çağırır. Her çağrı, prolemi temel temel duruma yaklaştırır.

    public static void gerisay(int n){
        if (n == 0) {
            System.out.print("BAŞLAT!");
        } else {
            System.out.println(n);
            gerisay(n - 1);
        }
        
    }
    public static void main(String[] var0) {
        gerisay(5);
    }
}
