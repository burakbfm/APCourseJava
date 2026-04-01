package Ders69_70;

import java.util.ArrayList;

public class kutuphaneAnaliz {
    public static void main(String[] var0) {

        ArrayList<Kitap> kutuphane = new ArrayList<>();
        kutuphane.add(new Kitap(300, "roman","Derbeder adam"));
        kutuphane.add(new Kitap(420, "şiir","Kaybettiğim Yıllar"));
        kutuphane.add(new Kitap(220, "roman", "Azabın pençesi"));
        kutuphane.add(new Kitap(200, "bilim","Kozmos"));

        // Roman türündeki Kitapların toplam sayfa sayısı:

        int toplamRomanSayfasi = 0;

        for (Kitap kitap : kutuphane) {
            if (kitap.turuver().equals("şiir")) {
                toplamRomanSayfasi += kitap.sayfasayisiver();
            }
        }
        System.out.println("Kütüphanedeki şiir türündeki kitapların toplam sayfa sayısı: " + toplamRomanSayfasi);

        for (int i = kutuphane.size() - 1; i >= 0; i--){
            kutuphane.get(i);
            kutuphane.get(i+1);
        }
        
        for (Kitap kitap : kutuphane) {
            if (kitap.sayfasayisiver() >= 300) {
                System.out.println("Sayfa Sayısı 300'den büyük olan kitap:" + kitap.isimver());
            }
        }

        System.out.println("Kütüphanedeki roman türündeki kitapların toplam sayfa sayısı: " + toplamRomanSayfasi);

    }
}
