package DersKodlari.Ders11_12;

import java.util.Random;
import java.util.Scanner;

public class Nesne {
    public static void main(String[] args) {
        // Sınıf kurabiye kalıbı gibi düşünülebilir.
        // Sınıf, nesnelerin sahip olacağı özellikleri (değişkenler) ve davranışları (metotlar) tanımlar.
        // Örneğin, bir "Kurabiye" sınıfı, kurabiyelerin rengi, şekli ve tadı gibi özelliklere sahip olabilir.
        // Nesne ise o kalıptan üretilen somut varlık yani kurabiyenin kendisidir.

        // Sınıf Soyuttur, Nesne Somuttur.

        // 1. Yol Literal(Kısayol) Yöntem
        // En yayhın kullanılan yöntemdir.
        String mesaj1 = "Merhaba Dünya!";

        // 2. Yol: "new" anahtar kelimesi ile nesne yaratarak
        // Bu, nesne yaratmanın standart/açık yoludur.
        String mesaj2 = new String("Merhaba Dünya!");

        System.out.println("Mesaj 1: " + mesaj1);
        System.out.println("Mesaj 2: " + mesaj2);


        // Scanner sınıfından bir nesne oluştujrma
        // (System.in, klavyeden girdi almanı sağlar)
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = myScanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi);

        // Random sınıfından bir nesne oluşturma
        // (Math.random()'a alternatif bir yöntem sunar)
        Random myRandom = new Random();

        // Sınıf(Class): Bir şeyi üretmek için kullanılan plan veya şablondur. Bir tariftir, bir tanımdır.
        // Nesne(Object): O planı veya tarigi kullanarak ürettiğimiz gerçek, somut bir üründür.

        // new anahtar kelimesi, Java'da yeni bir nesne oluşturmak için kullanılır.
        // Örneğin, bir sınıfın tanımını kullanarak yeni bir nesne yaratmak istediğimizde "new" kelimesini kullanırız.
        // Bir sınıf yazdığımız zaman bilgisayara ben arama diye bir kavram tanımlamak isterim deriz. bir gün araba üretirsem arabanın özellikleri (nitelik, metod) şunlar olsun deriz.
        // new kullandığımız zaman bilgisayara şunu deriz "Hani sana daha önce 'araba' yapmayı öğretmiştim ya, işte şimdi o tarifi kullanarak bana yeni bir araba yap."

        /*  
        Analoji 1: Banka Hesap Formu vs. Gerçek Hesaplar

        1. Sınıf (Class): BankaHesabi

        -Bankaya gittiğinizde size verilen boş hesap açma formudur.
        -Formun üzerinde "Hesap Sahibi:", "IBAN:", "Bakiye:" gibi boş alanlar (Nitelikler) vardır.
        -Ayrıca formun altında "Para Yatır", "Para Çek" gibi işlemler için buton yerleri (Metotlar) vardır.
        -Bu boş formun kendisi bir banka hesabı değildir. İçinde para yoktur.

        2. Nesne (Object): ahmetinHesabi ve zeynepinHesabi

        -Ahmet gelir, o boş formu alır, "Hesap Sahibi: Ahmet", "Bakiye: 5000" diye doldurur.
        ahmetinHesabi = new BankaHesabi() dediğimizde bu doldurulmuş formu, yani gerçek hesabı yaratmış oluruz.

        -Zeynep gelir, aynı boş formun bir kopyasını alır, "Hesap Sahibi: Zeynep", "Bakiye: 10000" diye doldurur. 
        zeynepinHesabi = new BankaHesabi() dediğimizde ikinci, bağımsız bir nesne yaratmış oluruz.

        -İkisi de BankaHesabi sınıfından üretilmiştir ama Ahmet'in paraCek() metodunu çağırması, Zeynep'in bakiyesini etkilemez.
        */
    }
    
}
