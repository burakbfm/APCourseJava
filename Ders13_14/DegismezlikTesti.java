package Ders13_14;

public class DegismezlikTesti {
    public static void main(String[] args) {
        // Değişmezlik (Immutability) Testi

        String s = "BuraK";

        System.out.println("1. Orijinal String 's' değeri: " + s);
        // bu kodun 's'yi değiştirmesini bekleriz ama değiştirmez.
        s.toLowerCase();
        System.out.println("Atama yapmadan yazdırma: " + s.toLowerCase());
        System.out.println("2. toLowerCase() metodundan sonra 's' değeri: " + s);

        // Neden değişmedi?
        // s.toLowerCase() metodu, "KodriX" nesnesini DEĞİŞTİRMEZ.
        // O, hafızada "kodrix" adında YENİ bir String nesnesi yaratır [cite: 197]
        // ve bu yeni nesneyi geri döndürür. Ama biz bu dönen değeri yakalamadık.

        // DOĞRU YÖNTEM (Yeniden Atama):
        // Yeni nesneyi yakalayıp 's' referansına tekrar atamalıyız.
        s = s.toLowerCase(); // toLowerCase()
        
        System.out.println("3. atama işleminden sonra 's' değeri: " + s);
    }
    
}
