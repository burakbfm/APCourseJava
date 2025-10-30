package DersKodlari.Ders9_10;

public class MatematikselHesaplar {
    public static void main(String[] args) {
        double dikKenarA = 3.0;
        double dikKenarB = 4.0;
        double hipotenus;

        // a'nın karesi + b'nin karesi
        double karelerToplami = Math.pow(dikKenarA, 2) + Math.pow(dikKenarB, 2);

        // Toplamın karekökü
        hipotenus = Math.sqrt(karelerToplami);
        
        System.out.println("Birinci dik kenar: " + dikKenarA);
        System.out.println("İkinci dik kenar: " + dikKenarB);
        System.out.println("Hipotenüs: " + hipotenus);
    }
}