package Ders62_63;

import java.text.ListFormat.Style;

public class LineerArama {
    public static void main(String[] var0) {
        int[] sayilar = {3, 5, 7, 9, 11, 58, 147,1548,8,7,84,1,2,5,4,78};
        int arananSayi = 147;

        int bulunanIndex = -1; // Başlangıçta "bulamadı olarak ayarladık

        // Standart for döngüsü kullanıcaz.
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == arananSayi) {
                bulunanIndex = i;
                break;
            }
        }

        if (bulunanIndex != -1) {
            System.out.println(arananSayi + " sayısı, dizinin " + bulunanIndex + ". indeksinde bulundu.");

        } else {
            System.out.println(arananSayi + " sayısı dizide bulunamadı.");
        }

        // Bir string dizisi içinde öğrenci isimlerini tutun.
        // kullanıcının aradığı bir ismi bulunca yazan bir program bulamazsa da bulamadık desin.
    }
    
}
