package Ders13_14;

public class FaturaParcalayici {
        public static void main(String[] args) {
            String faturaDetay = "Ürün: Laptop, Fiyat: 25000, Adet: 1";
            System.out.println("Fatura Detayı: " + faturaDetay);

            // AMAÇ 1: Ürün Adı
            String urunEtiketi = "Ürün: ";
            int urunBaslangic = urunEtiketi.length();

            int urunBitis = faturaDetay.indexOf(",");
            System.out.println("Ürün için başlangıç: " + urunBaslangic + ", bitiş: " + urunBitis);

            String urunAdi = faturaDetay.substring(urunBaslangic, urunBitis);
            System.out.println("Ürün Adı: " + urunAdi);
            // AMAÇ 2: Fiyat

        }
    
}
