package Ders25_26;

public class KisaDevre {
    public static void main(String[] args) {
        // De Morgan Kuralları - Short-Circcut Evulation - Kısa Devre Değerlendimresi

        // && (VE) = Eğer ilk koşul false ise sonucu ne olursa olsun false olur.
        // java da aynı mantıkla çalışıyor ikinci şartı hiç kontrol etmez direkt olarak atlar
        // if (kullanici != null && kullanici.isAdmin()) önce kullanıcının var olup olmadığını kontrol ediyorum sonrasında adminliğe bakıyorum
        // çünkü kullanıcıyı daha kontrol etmeden adminliğe bakarsam program hata verir VE Operatöründe ilk koşul false ise diğeri hiç kontrol edilmez
        
        // || (Veya) eğer ilk koşul true ise, sonucu ne olursa olsun true olacağı bellidir. Bu yüzden java ikinci ifadeyi kontrol etmeden atlar

        // De Morgan Kuralları ile mantığı tersine çevirme
        // Bazen karmaşık bir koşulun tam tersini (DEĞİL(!)'ini) almamız gerekebilir.

        // KURAL 1
        // '!(A && B)' ifadesi '!A || !B' ifadesine eşittir
        // 'HEM 18 YAŞINDAN BÜYÜK HEM DE EHLİYETİ VAR' DEĞİLSE demek 'YA 18 YAŞINDAN BÜYÜK DEĞİL VEYA EHLİYETİ YOK'
        // A = 18'DEN BÜYÜK B = EHLİYETİ VAR 
        
        // KURAL 2
        // !(A || B) ifaesi !A && !B ifadesine eşittir.
        //  (Günlerden cumartesi veya pazar değilse) demek (Günlerden Cumartesi değil ve pazar değil)

        String kullaniciAdi = null; // Henüz bir kullanıcı adı atanmamış
        
        // if (kullaniciAdi.equals("admin") && kullaniciAdi != null)

        if (kullaniciAdi != null && kullaniciAdi.equals("admin")) {
            System.out.println("Admin girişi yapıldı");
        } else {
            System.out.println("Güvenli Kontrol: Admin girişi yapmadı veya kullanıcı eksik.");
        }

    }
    
}
