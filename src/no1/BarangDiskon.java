package no1;

class BarangDiskon extends Barang {
    private double diskon;

    public BarangDiskon(String nama, double harga, int jumlah, double diskon) {
        super(nama, harga, jumlah);
        this.diskon = diskon;
    }

    @Override
    public double hitungTotalHarga() {
        return super.hitungTotalHarga() * (1 - diskon);
    }
}