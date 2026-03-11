package Ders73_74;

public class ogrenci {
    private Double notortalamasi;
    private boolean aktifmi;

    public ogrenci (Double notortalamasi, boolean aktifmi){
        this.notortalamasi = notortalamasi;
        this.aktifmi = aktifmi;
    }

    public double getOrtalama(){
        return this.notortalamasi;
    }

    public boolean isAktif(){
        return this.aktifmi;
    }
}
