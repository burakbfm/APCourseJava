package Ders33_34;

public class HarfSayma {
    public static void main(String[] var0) {
        String cumle = "Burak Burak Burak";

        // Sesli Harfler (a, e, ı, i, o, ö, u, ü)

        int harfSayaci = 0;

        for (int i = 0; i < cumle.length(); i++) {
            String harf = cumle.substring(i, i + 1).toLowerCase();

            if (harf.equals("b")) {
                harfSayaci++;
                System.out.println("Bulanan B harfi İndex: " + i + " | Şu ana kadar bulunan b harfi sayısı: " + harfSayaci);
            } else {
                System.out.println("İndex: " + i + " | Harf: " + harf);
            }
            

        }
        System.out.println("Toplam 'b' harfi: " + harfSayaci);

    }
    
}
