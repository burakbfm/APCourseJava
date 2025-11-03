package Ders13_14;

public class StringInceleme {
        public static void main(String[] args) {
            String cumle = "Java Programlama Dili";

            // Length() metodu: String'in uzunluğunu döner
            int uzunluk = cumle.length();
            System.out.println("Cümlenin Uzunluğu: " + uzunluk);

            // indexOf() metodu: Belirtilen karakterin veya alt dizinin ilk geçtiği index'i döner
            // 0'dan başlar
            int p_indeksi = cumle.indexOf("Programlama");
            System.out.println("Programlama - kelimseninin başlangıç indeksi: " + p_indeksi);

            int z_indeksi = cumle.indexOf("python");
            System.out.println("pyton - kelimesinin indeksi: " + z_indeksi);
            // Bulamazsa -1 döner

            // static (Sınıf) Metodları:
            // Doğrudan sınıfın kendisine aittir bir nesneye ihtiyaç duymazlar.
            // Math sınıfı. Math.pow(2,3) demek için yeni bir math nesnesi yaratmamız gerekmez.
            Math.pow(2, 3); // 2 üzeri 3 işlemi - Marh bir nesne ve pow o sınıfın static metodudur. ve nesne üretmeden kullanılabilir.

            // instance (Nesne) Metodları:
            // Bir nesneye bağlıdırlar ve o nesne üzerinden çağrılırlar.
            // String cumle = "Merhaba"; sınıf kullanarak bir nesne oluşturduk.
            int sayisaluzunluk = cumle.length(); // lenght() bir instance (nesne) metodudur. ve sınıf kullanarak üretilen nesne üzerinden çağrılır.


            // KURAL! 
            // String içindeki her karakterin bir sıra numarası(indexi) vardır ve bu numaralandırma her zaman 0'dan başlar.
            // Yani ilk karakterin indexi 0, ikinci karakterin indexi 1'dir.
            // Java kelimesinde J=0, a=1, v=2, a=3 şeklindedir.
        }
}
