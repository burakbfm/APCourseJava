package Ders71_72;

import java.util.ArrayList;

public class EnMutluHayvaniBul {
    public static void main(String[] var0) {
        // en mutlu sanal haycan kim.

        ArrayList<SanalHayvan> hayvanlar = new ArrayList<>();
        hayvanlar.add(new SanalHayvan("Pamuk", 70, "kedi"));
        hayvanlar.add(new SanalHayvan("Karabaş", 85, "köpek"));
        hayvanlar.add(new SanalHayvan("Boncuk", 90, "kuş"));
        hayvanlar.add(new SanalHayvan("Tekir", 55, "köpek"));

        SanalHayvan enMutluHayvan = hayvanlar.get(0);

        for (SanalHayvan mevcutHayvan : hayvanlar) {
            if (mevcutHayvan.mutlulukseviyesigetir() > enMutluHayvan.mutlulukseviyesigetir()) {
                enMutluHayvan = mevcutHayvan;
            }
        }

        System.out.println("En Mutlu Hayvan: " + enMutluHayvan.isimgetir() + " Mutluluk Seviyesi: " + enMutluHayvan.mutlulukseviyesigetir());
    }

    // MUTLULUK SEVİYESİ 75'DEN YÜKSEK HAYVANLARI YENİ BİR LİSTEYE KAYIT YAPIN.
}
