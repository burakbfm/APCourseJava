package Ders53_54;

public class Ogrenci {

    // "private" değişkenlerim (sınıf değişkenleri / özellikler / attributes)

    private String isim;
    private int OkulNumarası;
    private double notOrtalamasi;
    private String MezunOlduMu;

    // --- Yapıcı Metotlar (Constructors) ---
    public Ogrenci(String isim, int OkulNumarası, double notOrtalamasi, String MezunOlduMu) {
        this.isim = isim;
        this.OkulNumarası = OkulNumarası;
        this.notOrtalamasi = notOrtalamasi;
        this.MezunOlduMu = MezunOlduMu;

        System.out.println(this.isim + " adında yeni bir öğrenci nesnesi yaratıldı.");
    }

    public Ogrenci() {
        this.isim = "Heniz Atanmadı.";
        this.OkulNumarası = 0;
        this.notOrtalamasi = 0.0;
        this.MezunOlduMu = "Mezun Değil";
    }

    public Ogrenci(String isim){
        this.isim = isim;
        this.OkulNumarası = 0;
        this.notOrtalamasi = 0.0;
        this.MezunOlduMu = "Mezun Değil";
    }
    
    // --- Metotlar (Methods / Behaviors) ---
    public void bilgileriyazdirma(){
        System.out.println("******** Öğrenci Bilgileri ********");
        System.out.println("İsim: \t\t" + this.isim);
        System.out.println("Okul Numarası: \t" + this.OkulNumarası);
        System.out.println("Not Ortalaması: " + this.notOrtalamasi);
        System.out.println("Mezun Oldu Mu: \t" + this.MezunOlduMu);
    }
    
    // Teori 1 (setter metotları)
    public void notGuncelle(double yeniortalama){
        this.notOrtalamasi = yeniortalama;
    }

    public void mezunOlduMuGuncelle(String yeniDurum){
        this.MezunOlduMu = yeniDurum;
    }

    // Akıllı setter metodu
    public void mezunEt() {
        if (this.MezunOlduMu == "Mezun Değil") {
            this.MezunOlduMu = "Mezun";
        }
    }

    public void AktiviteYap(){
        if (this.notOrtalamasi <= 97.9){
            this.notOrtalamasi += 2.0;
        } else {
            System.out.println(this.isim + " öğrencisinin not ortalaması zaten maksimum seviyede.");
        }
    }

    // Teori 2 (getter metotları)
    public String isimGetir(){
        return this.isim;
    }

    public Integer okulNumarasiGetir(){
        return this.OkulNumarası;
    }

    public Double notOrtalamasiGetir(){
        return this.notOrtalamasi;
    }

    public String mezunOlduMuGetir(){
        if (this.MezunOlduMu == "Mezun"){
            return "Mezun";
        } else {
            return "Mezun Değil";
        }
    }

    // Akıllı getter metodu
    public boolean OnurOgrencisiMi(){
        if (this.notOrtalamasi >= 85.0){
            return true;
        } else {
            return false;
        }
    }
    
}
