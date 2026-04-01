package Ders67_68;

import java.util.ArrayList;

public class IlkArrayList {
    public static void main(String[] var0) {
        // Bir Array ile ArrayList arasındaki en temel ve en önemli fark nedir?”

        // Array'ler sabittir başlangıçta belirtiğimiz kadar eleman tutar. ArrayList'ler ise dinamik olarak büyüyebilirler.
        // ArrayList'ler eleman ekledikçe kendilerini otomatik olarak büyürler.

        // Arrayler yanlızca tek türde veri tutabilirler. ArrayList'ler ise herhangi bir türde veri tutabilirler.

        // Array'ler daha hızlıdır çünkü sabittirler ve bellekte ardışık olarak depolanırlar. 
        // ArrayList'ler ise dinamik olarak büyüdükleri için daha yavaştırlar.

        // Array'ler özellikler eklenir liste.length ile uzunluğunu öğrenebiliriz. ArrayList'ler ise .size() metodu ile uzunluğunu öğrenebiliriz.

        // Arraylistler için java.util.ArrayList sınıfını kullanırız. ArrayList'ler java.util paketinde bulunur ve bu paketi import etmemiz gerekir.
        
        //int[] notlar = new int[5];
        ArrayList<String> sehirler = new ArrayList<>();

        // .add()
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Bursa");
        sehirler.add("Adana");

        System.out.println("Şehirler Listesi: " + sehirler);

        // .size()
        System.out.println("Şehirler Listesi Boyutu: " + sehirler.size());

        // .get()
        System.out.println("İlk Şehir: " + sehirler.get(0));
        System.out.println("İkinci Şehir: " + sehirler.get(1));

        // 1. import gerekliliği
        // 2. <> (generics) kullanımı
        // .lenght yerine .size() metodu gibi
        // [i] yerine .get(i)

        // Double tipinde birkaç ürünün fiyatını tutan bir ArerayList oluşturun. Listeye 3-4 fiyat ekleyin. ardından listenin boyutunu ve ikinci sıradaki ürünün fiyatını ekrana yazdırın.
    }
}
