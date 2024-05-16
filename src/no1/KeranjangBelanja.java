package no1;

import java.util.ArrayList;

class KeranjangBelanja {
    private ArrayList<Barang> barangBelanja;

    // Constructor untuk inisialisasi objek KeranjangBelanja
    public KeranjangBelanja() {
        barangBelanja = new ArrayList<>();
    }

    // Method untuk menambahkan barang ke dalam keranjang belanja
    public void tambahBarang(Barang barang) {
        barangBelanja.add(barang);
    }

    // Method untuk menampilkan semua barang dalam keranjang belanja
    public void tampilkanBarang() {
        System.out.println("Barang dalam keranjang belanja:");
        for (Barang barang : barangBelanja) {
            System.out.println("Nama: " + barang.getNama());
            System.out.println("Harga: Rp " + barang.getHarga());
            System.out.println("Jumlah: " + barang.getJumlah());
            System.out.println("Total Harga: Rp " + barang.hitungTotalHarga());
            System.out.println();
        }
    }
}
