package Ders55_56;

public class BankaIslemleri {
    public static void main(String[] var0) {
        BankaHesabi hesap1 = new BankaHesabi("Burak Üstün", 12500.75);
        BankaHesabi hesap2 = new BankaHesabi("Ayşe Kara", 9800.50);
        BankaHesabi hesap3 = new BankaHesabi("Deniz Yılmaz", 15000.00);
        BankaHesabi hesap4 = new BankaHesabi("Emre Demir", 7600.25);
        BankaHesabi hesap5 = new BankaHesabi("Selin Çelik", 13450.00);
        BankaHesabi hesap6 = new BankaHesabi("Mert Kaya", 8900.80);

        System.out.println(hesap1.Bakiyegetir());

        if (hesap1.paraCek(10000)) {
            System.out.println("Para çekme işlemi başarılı.");
        } else {
            System.out.println("Para çekme işlemi başarısız.");
        }

        hesap1.paraYatir(4500.78);

        System.out.println("Toplam Hesap Sayısı: " + BankaHesabi.toplamHesapSayisiGetir());

        BankaHesabi.toplamhesapsayisiniduzenle(50);

        System.out.println("Toplam Hesap Sayısı: " + BankaHesabi.toplamHesapSayisiGetir());
    }
}
