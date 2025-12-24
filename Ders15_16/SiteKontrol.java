package Ders15_16;

public class SiteKontrol {
    public static void main(String[] args) {
        // length() = String uzunluğu verir.
        // indexOf() = String ifade içindeki istediğimiz ilk ifadenin konumu verir
        // substring() = belirtiğimiz aralıktaki string ifadeyi verir fakat son belitriğimizin - 1 kadarı substring(5,10) 5 9
        // equals() = equals sadece içerikleri kontrol eder yani nesneler farkl olsa bile sorun teşkil etmez
        // == nesneleride kontrol eder o yüzden içerikler aynı olsa bile nesneler farklı olursa hata verir.
        // compareTo = string ifadeleri unicodlarına göre karşılaştırır
        // Sıfır(0) Eğer kelime1 ve kelime2 eşite
        // Negatif Sayı(-) : Eğer kelime3 alfabetik olarak kelime4'den  önce geliyora ("armut".compareTo("elma"))
        // Pozitif Sayı(+) : Eper kelime5 alfabetik olarak kelime6'den sonra geliyorsa ("zebra".compareTo("kedi"))
        
        /*  String mesaj2 = new String("Merhaba Dünya!"); 
            String mesaj1 = "Merhaba Dünya!"; // mesaj2 ile içerik aynı olsa bile new diyerek farklı bir nesneye atamasını yaptık.

            String x = "Burak Üstün";
            String y = "Burak Üstün"; // Java bunu optimize eder ve x ile aynı nesneyi kullanır çünkü içerik aynı
        
            System.out.println(mesaj1 == mesaj2); // false farklı nesneler
            System.out.println(x == y); //true aynı nesne 
        */

        /*
         * Problem 1:  İsim Soyisim ayırıcı
         * 
         * Verilen String tamAd = "Burak Üstün"
         * İstenen: Ekrana "İsim: Burak" ve "Soyisim: Üstün" yazdırmak.
         */

         /*
          * Problem 2: Web Sitesi Uzantı Kontrolü
          * 
          * Verilen String siteAdresi = "www.kodrix.net"
          * İstenen: Sitenin ".net" ile bitip bitmediğini kontrol edip ekrana true veya false yazdırmak.
          */
    }
    
}
