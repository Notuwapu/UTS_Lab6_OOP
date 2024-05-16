package no1;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjangBelanja = new KeranjangBelanja();

        // Meminta pengguna untuk memasukkan informasi barang belanjaan
        String namaBarang = UserInput.getStringInput("Masukkan nama barang: ");
        double hargaBarang = UserInput.getDoubleInput("Masukkan harga barang: ");
        int jumlahBarang = UserInput.getIntegerInput("Masukkan jumlah barang: ");
        double diskon = UserInput.getDoubleInput("Masukkan diskon (misal 0,1 untuk 10%): ");

        // Membuat objek BarangDiskon atau Barang
        Barang barangBaru;
        if (diskon > 0) {
            barangBaru = new BarangDiskon(namaBarang, hargaBarang, jumlahBarang, diskon);
        } else {
            barangBaru = new Barang(namaBarang, hargaBarang, jumlahBarang);
        }

        // Menambahkan barang ke dalam keranjang belanja
        keranjangBelanja.tambahBarang(barangBaru);

        // Menampilkan semua barang dalam keranjang belanja
        keranjangBelanja.tampilkanBarang();
    }
}