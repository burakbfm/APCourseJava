package Ders13_14;

public class EmailAyiklayici {
    public static void main(String[] args) {
        String email = "burak.ustun@kodrix.net";
        System.out.println(email);

        // AMAÇ  1: Kullanıcı adını almak ("burak.ustun")
        // STRATEJİ: Baştan (indeks 0) başla ve '@' karakterine kadar (hariç) al.

        // System.out.print(email.substring(0,11)); - Direkt olarak el ile sayarak burak.ustun'u aldık. fakat istediğimiz bu değil.

        int atIndeksi = email.indexOf("@"); // 11
        System.out.println("'@' karakterinin indeksi: " + atIndeksi);
        
        String kullaniciAdi = email.substring(0,atIndeksi);
        System.out.println("Kullanıcı Adı: " + kullaniciAdi);
        // AMAÇ 2: Domain Adını Almak ("kodrix.net")
        // STRATEJİ: '@' karakterinden sonraki tüm karakterleri al.
        String domain = email.substring(atIndeksi+1);
        System.out.println("Domain Adı: " + domain);
    }
    
}
