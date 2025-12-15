package Ders37_38;
public class odev {
    public static void main(String[] var0) {
        // Aşağıdaki iç içe döngü yapıları verildiğinde, içlerindeki System.out.println("X"); komutunun toplamda kaç kez çalışacağını

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
            System.out.println("X");
            }
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
            System.out.println("X");
            }
        }
    }
}
