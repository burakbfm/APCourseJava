package Ders33_34;

public class SesliHarfSayaci {
    public static void main(String[] var0) {
        String cumle = "Merhaba";

        // Sesli Harfler (a, e, ı, i, o, ö, u, ü)

        int SesliHarfSayaci = 0;

        for (int i = 0; i < cumle.length(); i++) {
            String harf = cumle.substring(i, i + 1).toLowerCase();

            if (harf.equals("a") || harf.equals("e") || harf.equals("ı") || harf.equals("i") ||
                harf.equals("o") || harf.equals("ö") || harf.equals("u") || harf.equals("ü")) {
                SesliHarfSayaci++;
                System.out.println("İndex: " + i + " Sesli Harf: " + harf + " | Şu ana kadar bulunan sesli harf sayısı: " + SesliHarfSayaci);
            } else {
                System.out.println("İndex: " + i + " | Harf: " + harf);
            }
            

        }
        System.out.println("Toplam Sesli Harf Sayısı: " + SesliHarfSayaci);

    }
    
}
