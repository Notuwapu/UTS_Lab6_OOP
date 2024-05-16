package no4;

public class FisikanMain {
    public static void main(String[] args) {
        // Perhitungan Fisika

        // Menghitung Energi Kinetik
        Fisika energiKinetik = new Fisika(10, 5);
        System.out.println("Energi Kinetik: " + energiKinetik.hitungEnergiKinetik() + " Joule");

        // Menghitung Momentum
        Fisika momentum = new Fisika(10, 5, true);
        System.out.println("Momentum: " + momentum.hitungMomentum() + " kg m/s");

        // Menghitung Percepatan
        Fisika percepatan = new Fisika(20, 10, true, true);
        System.out.println("Percepatan: " + percepatan.hitungPercepatan() + " m/s^2");
    }
}