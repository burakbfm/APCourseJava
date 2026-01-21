package Ders55_56;

public class BankaHesabi {

    private String hesapSahibi;
    private double bakiye;


    public BankaHesabi(String sahip, double baslangicBakiye) {
        this.hesapSahibi = sahip;
        this.bakiye = baslangicBakiye;
        toplamHesapSayisi++;
        System.out.println(this.hesapSahibi + " adlı hesap sahibi için yeni bir banka hesabı oluşturuldu. Başlangıç bakiyesi: " + this.bakiye);
        
    }

    public double Bakiyegetir() {
        return this.bakiye;
    }

    public void paraYatir(double miktar) {
        if (miktar > 0) {
            this.bakiye += miktar;
            System.out.println(this.hesapSahibi + " adlı hesap sahibinin hesabına " + miktar + " TL yatırıldı. Yeni bakiye: " + this.bakiye);
        } else {
            System.out.println("Yatırılacak miktar pozitif olmalıdır.");
        }
    }

    public boolean paraCek(double miktar) {
        if (miktar > 0) {
            if (miktar <= this.bakiye) {
                this.bakiye -= miktar;
                System.out.println(this.hesapSahibi + " adlı hesap sahibinin hesabından " + miktar + " TL çekildi. Kalan bakiye: " + this.bakiye);
                return true;
            } else {
                System.out.println("Yetersiz bakiye. Mevcut bakiye: " + this.bakiye);
                return false;
            }
        } else {
            System.out.println("Çekilecek miktar pozitif olmalıdır.");
            return false;
        }
    }

    // Instance method çağrısı
    // private double bakiye;
    // her new BankaHesabi ile oluşturulan nesne için ayrı ayrı tutulur.

    // static Değişkenler / Sınıf Değişkenleri
    // private static int toplamHesapSayisi;
    // tüm BankaHesabi nesneleri için ortaktır, tek bir tane vardır
        
    // Sınıfın kendisine aittir, nesneye değil.
    // O sınıftan yaratılan tüm nesneler bu tek bir değişkeni paylaşır. Sadece tek bir kopyası vardır.
    private static int toplamHesapSayisi = 0;

    public static int toplamHesapSayisiGetir() {
        return toplamHesapSayisi;
    }

    public static void toplamhesapsayisiniduzenle(int yeniSayi) {
        toplamHesapSayisi = yeniSayi;
    }


}

