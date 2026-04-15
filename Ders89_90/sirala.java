package Ders89_90;

public void sirala(int[] dizi, int sol, int sag) {
    if (sol < sag) {
        int orta = (sol + sag) / 2;
        sirala(dizi, sol,orta) // Sol tarafı böl
        sirala(dizi, orta, +1, sag) // Sağ tarafı böl

        birleştir(dizi, sol, orta, sag)
    }
}