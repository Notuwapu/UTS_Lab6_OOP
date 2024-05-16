package no4;

class Fisika {
    double massa;
    double kecepatan;
    double waktu;
    double gaya;

    // Konstruktor untuk menghitung Energi Kinetik
    Fisika(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    // Konstruktor untuk menghitung Momentum
    Fisika(double massa, double kecepatan, boolean isMomentum) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    // Konstruktor untuk menghitung Percepatan
    Fisika(double gaya, double massa, boolean isPercepatan, boolean dummy) {
        this.gaya = gaya;
        this.massa = massa;
    }

    // Metode overloading untuk menghitung Energi Kinetik: EK = 0.5 * m * v^2
    double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    // Metode overloading untuk menghitung Momentum: p = m * v
    double hitungMomentum() {
        return massa * kecepatan;
    }

    // Metode overloading untuk menghitung Percepatan: a = F / m
    double hitungPercepatan() {
        return gaya / massa;
    }
}