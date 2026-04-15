package Ders83_84;
import java.util.Arrays;

public class VeriAnalizi {
    public static void main(String[] var0) {
        ArrayList<GunlukVeri> ankara_verileri = new ArrayList<GunlukVeri>();
        ankara_verileri.add(new GunlukVeri(1, 20.5));
        ankara_verileri.add(new GunlukVeri(2, 22.0));
        ankara_verileri.add(new GunlukVeri(3, 19.8));

        // 1 Ortalama Hesaplama
        double toplam_sicaklik = 0.0;
        for (GunlukVeri v: ankara_verileri) {
            toplam += v.getSicaklik();
        }

        System.out.println("Ortalama: " + (toplam / ankara_verileri.size()))


        // 2. EN SICAK GÜNÜ HESAPLAMA
        GunlukVeri enSicak =  ankara_verileri.get(0)
        for (GunlukVeri v: ankara_verileri) {
            if(v.getsicaklik() > enSicak.getsicaklik()) {
                enSicak = v;
            }
        }
        System.put.prinlln("En Sıcak: " + enSicak.getGun() + ". gün " + enSicak.getSicaklik() + " Derece.")

        // 3. FİLİTRELEME (Sıcaklık 20'den fazlaysa yeni listeye ekle)
        ArrayList<GunlukVeri> sicak_günler_listesi = new ArrayList<>();
        for (GunlukVeri v : ankara_verileri) {
            if(v.getSicaklik() > 20.0) {
                sicak_gunler_listesi.add(v);add
            }
        }

    }
}