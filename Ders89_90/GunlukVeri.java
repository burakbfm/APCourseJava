package Ders85_86;

public class GunlukVeri {
    private int gun_no; // Hangi gün
    private double sicaklik_derece; // Kaç derece

    public GunlukVeri(int gun_no, double sicaklik_derece) {
        this.gun_no = gun_no;
        this.sicaklik_derece = sicaklik_derece;
    }

    public int getGun() {return this.gun_no;}

    public double getSicaklık() {
        return this.sicaklik_derece;
    }
}