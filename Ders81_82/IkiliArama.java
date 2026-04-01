package Ders81_82;

public class IkiliArama {

    public static int IkiliArama(int[] dizi, int aranan) {
        int sol = 0;
        int sag = dizi.length-1;

        while (sol <= sag) {
            int orta = (sol + sag) / 2;

            if (dizi[orta] == aranan) {
                return orta;
            } else if (aranan < dizi[orta]) {
                sag = orta -1; // Sol yarıda ara
            } else {
                sol = orta + 1; // sağ yarıda ara
            }
        }
        return -1; // Döngü bitti ve bulamadık 
    }
    
}
