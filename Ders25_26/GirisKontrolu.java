package Ders25_26;

public class GirisKontrolu {
    public static void main(String[] args) {
        // MANTIKSAL OPERATÖRLER

        // && (VE / AND) bir ifadenin sonucunun true olabilmesi için her iki tarafındaki
        // koşulun da true olması gerekir.

        // true && true -> true
        // true && false -> false
        // false && true -> false
        // false && false -> false

        // || (VEYA / OR) Sonucun true olması için, baplacın iki tarafındaki koşullardan en az birinin true olması yeterli
        // true || true -> true
        // true || false -> true
        // false || true -> true
        // false || false -> false

        // ! (DEĞİL / NOT) Bu opreatörün, bir boolen ifadesinin sonucunu tersine çevirdiğini söyleyebiliriz.
        // !true -> false
        // (5 > 10) -> false   5 10'DAN BÜYÜKTÜR DİYE SORARIM VE CEVAP -> false
        // !(5 > 10) -> true  5 10'DAN BÜYÜK DEĞİLDİR -> true 

        int yas = 21;
        boolean davetiyeVarMi = true;

        // Senaryo 1 VIP alana giriş için 18 yaşından büyük ve daviyetsi olmalı.
        if (yas >= 18 && davetiyeVarMi == true) {
            System.out.println("VIP alana hoşgeldiniz efendim.");
        } else {
            System.out.println("Üzgünüm, VIP alana giriş yapamazsınız.");
        }

        // Senaryo 2 hafta sonu mu
        String gun = "Cumartesi";
        if (gun.equals("Cumartesi") || gun.equals("Pazar")) {
            System.out.println("İyi Tatiller");
        } else {
            System.out.println("Daha hafta sonu olmamış");
        }
        
    }
    
}
