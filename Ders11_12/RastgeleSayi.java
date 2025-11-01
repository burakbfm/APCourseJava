package DersKodlari.Ders11_12;

public class RastgeleSayi {
        public static void main(String[] args) {
                // int sayi = (int)(Math.random() * (max - min + 1)) + min;
                /*
                Problem 1: Belirli Aralık: “50 ile 100 (dahil) arasında rastgele bir tam sayı üreten kodu yazın.”
                Çözüm İpucu: min = 50 , max = 100 .
                */
                int rastgeleSayi = (int)(Math.random() * 51) + 50;
                System.out.println("50 ile 100 arasında rastgele sayı: " + rastgeleSayi);

                System.out.println("--------------------------------");
                /* 
                Problem 2: Yazı Tura Simülasyonu: “Yazı tura atan ve ekrana ‘Yazı Geldi’ veya ‘Tura Geldi’
                yazdıran bir program yazın.”
                Çözüm İpucu: 0 ve 1 arasında rastgele bir sayı üretin. if (sayi == 0) ise “Yazı”, değilse
                “Tura” yazdırın. Bu, bir sonraki ünite olan koşul yapılarına harika bir ön hazırlıktır.
                */
                
                int yaziTura = (int)(Math.random() * 2);
                if (yaziTura == 0) { // = Atama == Karşılaştırma
                        System.out.println("Yazı Geldi");
                } else { 
                        System.out.println("Tura Geldi");
                }

                System.out.println("--------------------------------");
                /* 
                Problem 3: Oyun Karakteri Yaratıcı: “Bir rol yapma oyunu için karakter yaratıyoruz. Karakterin
                Güç (Strength), Çeviklik(Dexterity) ve Zeka (Intelligence) özelliklerini 3 ile 18 arasında (3d6 zar
                atışı gibi) rastgele değerlerle oluşturan bir program yazın.”
                */
                int guc = (int) (Math.random() * (18 - 3 + 1)) + 3; // formüllü ifade
                int ceviklik = (int) (Math.random() * 16 ) + 3; // mantıksal ifade
                int zeka = (int) (Math.random() * 16 ) + 3; // mantıksal ifade

                System.out.println("*--- Yeni Krakter Oluşturuldu ---*");
                System.out.println("Güç (Strength): " + guc);
                System.out.println("Çeviklik (Dexterity): " + ceviklik);
                System.out.println("Zeka (Intelligence): " + zeka);                
        }
    
}
