package Ders19_20;

public class FisOlusturucu {
    public static void main(String[] args) {
        /*
        Birkaç ürünün fiyat veadet bilgilerini kullanarak KDV ve genel
        toplam gibi değerleri hesaplayan ve bunları düzenli bir alışveriş fişi formatında ekrana yazdıran
        bir program yazmak.
        
        https://prnt.sc/S6YJ4LNG6gvk
        
        Problemi küçük parçalara ayırın:
        1. Verileri Değişkenlerde Sakla (Bugünkü Ders)
        2. Matematiksel Hesaplamaları Yap (Ödev ve Sonraki Ders)
        3. ÇıktıyıFormatla (Sonraki Ders)
        
        Ödev:
        Projenin “Hesaplamalar” bölümünü tamamlanacak Her bir ürünün toplam fiyatını
        ( urun1_toplam = urun1_fiyat * urun1_adet; gibi) ve tüm ürünlerin KDV’siz ara toplamını
        ( araToplam ) hesaplayıp yeni değişkenlere atın. Henüz bir şey yazdırmanıza, sadece
        matematiksel işlemleri yapın
         */

         //1 --- GİRDİLER / VERİLER ---
        // Bu bölüm, fişte yer alacak ürün bilgilerini saklar.
        // 1. Ürün Bilgileri
        String urun1_adi = "Süt";
        double urun1_fiyat = 30.0;
        int urun1_adet = 2;
        // 2. Ürün Bilgileri
        String urun2_adi = "Ekmek";
        double urun2_fiyat = 10.0;
        int urun2_adet = 1;
        // Sabit Değerler
        double kdvOrani = 0.18;
        //2 --- HESAPLAMALAR ---
        double urun1_toplam = urun1_fiyat * urun1_adet;
        double urun2_toplam = urun2_fiyat * urun2_adet;

        double araToplam = urun1_toplam + urun2_toplam;

        double kdvTutari = araToplam * kdvOrani;

        double genelToplam = araToplam + kdvTutari;
        //3 --- ÇIKTI ---
        System.out.println("------- |KODRİX MARKET| -------");
        System.out.println("Ürün\t\tAdet\tFiyat");
        System.out.println("-------------------------------");
        System.out.println(urun1_adi + "\t\tx " + urun1_adet + "\t" + urun1_toplam + " TL");
        System.out.println(urun2_adi + "\t\tx " + urun2_adet + "\t" + urun2_toplam + " TL");
        System.out.println("-------------------------------");
        System.out.println("Ara Toplam:\t\t" + araToplam + " TL");
        System.out.println("KDV (%18):\t\t" + kdvTutari + " TL");
        System.out.println("===============================");
        System.out.println("GENEL TOPLAM:\t\t" + genelToplam + " TL");
    }
        
    
}
