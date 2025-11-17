package Ders17_18;

public class VeriKarsilastirma {
    public static void main(String[] args) {
        // TEMEL KAVRAMLAR
        /*
         * int = Tam sayılar - 5
         * double = Kesirli - Ondalıklı Sayılar - 5.2
         * boolen = true/false
         * 
         * Değişken(Variable): Verileri sakladığımız etiketli kutu a = 5
         * 
         * Atama Operatörü(=): Sağdaki değeri soldaki kutuya koyar.
         * 
         * Casting(Veri Dönüşümü): Veri tipini bilinçli olarak dönüştürme ((int)9.9 veya
         * (dobule) 10)
         * 
         * İmmutability(Değişmezlik): String nesnelerinin atama yapılmadığı sürece
         * içinin asla değiştirilemeyeceği kuralı.
         */

        // OPERATÖRLER (Aletlerimiz)
        /*
         * Aritmatik | +, -, *, /(bölme) ve %(kalan)
         * 
         * a = a + 5
         * 
         * Bileşik Atama | +=, -=, *=, /=
         * 
         * a += 5
         * 
         * Artırtma/Azaltma ++ ve -- (Birer birer arttırma ve azaltma)
         * a = a + 1
         * a += 1
         * 
         * a --
         */

        // METOTLAR (HAZIR FONKSİYONLARIMIZ)
        /*
         * System.out.print(): Ekrana bir şey yazdırır ve alt satıra geçer
         * 
         * Math.pow() = üssünü alma
         * Math.sqrt() = karekök alma
         * Math.random() 0.0 - 1.0 rastgele sayı üretir fakat 1 hariç
         * 
         * length() = String'in uzunluğunu(karakter sayısı) verir
         * indexOf() = Bir karakterin veya metnin ilk bulunduğu yerin indeksini verir.
         * substring(a,b) = String'in belirli bir parçasını kopyalayıp yeni bir String
         * olarak verir.
         * equals() = İki String'in içeriğinin birebir aynı olup olmadığını kontrol eder
         * (==)
         * 
         */

        // AKTİVİTE: MERKEZİ PROBLEM
        /*
         * Problem: String siparis = "URUN:KLAVYE|FIYAT:750|ADET:2"; formatındaki bir
         * veriden
         * “KLAVYE”, “750” ve “2” bilgilerini ayrı değişkenlere nasıl atarız?
         * Çözüm Adımları:
         * 1. “URUN:” ve “|” arasındaki metni bulmakiçin indexOf ve substring kullan.
         * 2. “FIYAT:” ve “|” arasındaki metni bulmakiçin indexOf ve substring kullan.
         * 3. “ADET:” ten sonraki metni bulmakiçin indexOf ve substring kullan.
         */
        String siparis = "URUN: KLAVYE | FIYAT:750 | ADET:2";
        
        // --- 1. Ürün adını bulalım ---
        // Strateji: İlk ":" karakterinden başla, ilk "|" karakterine kadar al.
        int urunBaslangic = siparis.indexOf(":") + 1;
        int urunBitis = siparis.indexOf("|");
        String urunAdi = siparis.substring(urunBaslangic, urunBitis);

        // --- 2. Fiyatı bulalım ---
        // Strateji: İlk "|" karakterinden *sonraki* ":" karakterini bul, 
        // oradan başla ve bir sonraki "|" karakterine kadar al. 
        int fiyatBaslangic = siparis.indexOf(":", urunBitis) + 1; 
        int fiyatBitis = siparis.indexOf("|", fiyatBaslangic); 
        String fiyatStr = siparis.substring(fiyatBaslangic, fiyatBitis); 

        // --- 3. Adeti bulalım ---
        // Strateji: İkinci "|" karakterinden (fiyatBitis) *sonraki* ":" 
        // karakterini bul ve oradan String'in sonuna kadar git. 
        int adetBaslangic = siparis.indexOf(":", fiyatBitis) + 1;
        String adetStr = siparis.substring(adetBaslangic);

        // --- Sonuçları Yazdıralım ---
        // (Plandaki kod örneğinde sadece ürün adı ve fiyat yazdırılmıştı [cite: 149-151])
        System.out.println("Ürün Adı:" + urunAdi);
        System.out.println("Fiyat: " + fiyatStr);
        System.out.println("Adet: " + adetStr);

    }
}