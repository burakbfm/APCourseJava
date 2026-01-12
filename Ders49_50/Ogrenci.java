package Ders49_50;

public class Ogrenci {
    /// ************** NOT **************
    // Souytlama () Abstraction
    // Kapsülleme () Encapsulation

    // Gerekli ve temel özelliklerine odaklanmak.
    // İsim String
    // OkulNumarası int
    // notOrtalamasi double
    // MezunOlduMu boolen

    // Öğrenci nesnesinin kendine özgü durumunu (state) belirler bunlara "örnek değişkenler" denir.
    // ve sınıfın içinde ama tüm metotların dışında tanımlanır.

    // private (özel): bu kapsulün kendisiidir.
    // Bir değişkeni private yaptığımızda ona sadece ve sadece o sınıfın içinden erişilebilir.

    // Sınıfın özellikleri(instance variables) her zaman private olmalıdır 

    // this Anahtar Kelime: Consturactor parametresinin adı (İsim) ile örnek değilkenin adı (isim) aynı olduğunda, 
    // sınıfın kendini değişkenini belirtmmek için this.isim kullanılır.

    /// ************** NOT BİTİŞ **************

    // Örnek Değişkenlerim (Instance variables / Attributes / State) ...
    // bu değişkenler, her bir öğrenci nesnesinin kendine ait özelliklerini tutar
    // "private" oldukları için, bu verilere dışarıdan erişilemez.

    private String isim;
    private int OkulNumarası;
    private double notOrtalamasi;
    private boolean MezunOlduMu;

    // --- Yapıcı Metotlar (Constructors) ---
    public Ogrenci(String isim, int OkulNumarası, double notOrtalamasi, boolean MezunOlduMu) {
        this.isim = isim;
        this.OkulNumarası = OkulNumarası;
        this.notOrtalamasi = notOrtalamasi;
        this.MezunOlduMu = MezunOlduMu;

        System.out.println(this.isim + " adında yeni bir öğrenci nesnesi yaratıldı.");
    }

    // --- 2 Yapıcı Metotlar (Constructors) ---
    // Yeni kaydolan, hemüz bilgisi olmayan öğrenciler için
    public Ogrenci() {
        this.isim = "Heniz Atanmadı.";
        this.OkulNumarası = 0;
        this.notOrtalamasi = 0.0;
        this.MezunOlduMu = false;
    }
    
    // --- Metotlar (Methods / Behaviors) ---

    public void bilgileriyazdirma(){
        System.out.println("******** Öğrenci Bilgileri ********");
        System.out.println("İsim: \t\t" + this.isim);
        System.out.println("Okul Numarası: \t" + this.OkulNumarası);
        System.out.println("Not Ortalaması: " + this.notOrtalamasi);
        System.out.println("Mezun Oldu Mu: \t" + this.MezunOlduMu);
    }
    
    // Teori 1 
    // void - geri dönüş yok
    // iş yapar, değiştirir biter
    // Bu bir mutator / setter
    // Bu metot bana bir şey ver demez, şunu değiştir.

    public void notGuncelle(double yeniortalama){
        this.notOrtalamasi = yeniortalama;
    }


    // Teori 2
    // String - dönecek veri tipi
    // return zorunlu
    // private değişkene güvenli erişim
    public String isimGetir(){
        return this.isim;
    }

    public Ogrenci(String isim){
        this.isim = isim;
        this.OkulNumarası = 0;
        this.notOrtalamasi = 0.0;
        this.MezunOlduMu = false;
    }
}
