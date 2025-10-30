package DersKodlari.Ders7_8;
/*
* Bu program, bir banka hesabındaki para yatırma ve çekme
* işlemlerini simüle eder ve her işlemden sonra güncel bakiyeyi gösterir.
* Yazar: Burak Üstün
* Tarih: 8 Ekim 2025
*/
public class BankaHesabi {
    public static void main(String[] args) {
        // double veri tipi, ondalıklı para miktarları için uygundur.
        double bakiye = 1000.50; // Hesaptaki başlangıç parası

        System.out.println("Hesap açıldı. Başlangıç bakiyesi: " + bakiye + " TL");

        // Hesaba para yatırma işlemi
        double yatirilanMiktar = 250.25;
        bakiye += yatirilanMiktar; // bakiye = bakiye + yatirilanMiktar;
        System.out.println(yatirilanMiktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");

        // Hesaptan para çekme işlemi
        double cekilenMiktar = 400.0;
        bakiye -= cekilenMiktar; // bakiye = bakiye - cekilenMiktar;
        System.out.println(cekilenMiktar + " TL çekildi. Son bakiye: " + bakiye + " TL");
    }
}