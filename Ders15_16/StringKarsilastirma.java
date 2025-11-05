package Ders15_16;

public class StringKarsilastirma {
    public static void main(String[] args) {
        // = atama == karşılaştırma
        // 5 == 5 true
        // 6 == "6" false

        String mesaj2 = new String("Merhaba Dünya!"); 
        String mesaj1 = "Merhaba Dünya!"; // mesaj2 ile içerik aynı olsa bile new diyerek farklı bir nesneye atamasını yaptık.


        String x = "Burak Üstün";
        String y = "Burak Üstün"; // Java bunu optimize eder ve x ile aynı nesneyi kullanır çünkü içerik aynı
        
        System.out.println(mesaj1 == mesaj2); // false farklı nesneler
        System.out.println(x == y); //true aynı nesne 
        

        System.out.println(mesaj1.equals(mesaj2)); // true
        // x.equals(y) metodu direkt olarak içeriğe bakar. o yüzden farklı adreslenseler bile eğer içerik eşitse true değerini döndürür

        // ALTIN KURAL: Nesnelerin içeriklerini karşılaştırırkan her zaman .equals() metodunu kullanırız.

        // .compareTo 

        // Sıfır(0) Eğer kelime1 ve kelime2 eşite
        String kelime1 = "Armut";
        String kelime2 = "Armut";

        System.out.println("Armut.compareTo(Armut): " + kelime1.compareTo(kelime2));
        // Negatif Sayı(-) : Eğer kelime3 alfabetik olarak kelime4'den  önce geliyora ("armut".compareTo("elma"))
        String kelime3 = "Armut";
        String kelime4 = "Elma";

        System.out.println("Armut.compareTo(Elma): " + kelime3.compareTo(kelime4));
        // Pozitif Sayı(+) : Eper kelime5 alfabetik olarak kelime6'den sonra geliyorsa ("zebra".compareTo("kedi"))
        String kelime5 = "Zebra";
        String kelime6 = "Kedi";
        System.out.println("Zebra.compareTo(Kedi): " + kelime5.compareTo(kelime6));
    }
    
}
