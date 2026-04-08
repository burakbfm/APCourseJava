package Ders87_88;

public class OzYinelemeliIkiliArama {
    public static int OzYinelemeliIkiliArama(int[] dizi, int aranansayi,int sol, int sag){
        if (sol <= sag){
            int orta = (sol + sag) / 2;
            if (dizi[orta] == aranansayi) {
                return orta;
            }
            else if (aranansayi < dizi[orta] ) {
                return OzYinelemeliIkiliArama(dizi, aranansayi, sol, (orta -1));

            }
            else {
                return OzYinelemeliIkiliArama(dizi, aranansayi, (orta + 1), sag);
            }
        }
        return -1;
    }
}
