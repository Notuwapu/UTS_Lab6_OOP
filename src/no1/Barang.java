package no1;

class Barang {
    private String nama;
    private double harga;
    private int jumlah;

    // Constructor untuk inisialisasi objek Barang
    public Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Getter dan setter untuk nama barang
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk harga barang
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter dan setter untuk jumlah barang
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Method untuk menghitung total harga
    public double hitungTotalHarga() {
        return harga * jumlah;
    }
}
