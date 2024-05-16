package no3;

public class Account {

    private String id;
    private String nama;
    private int saldo;

    public Account(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.saldo = 0;
    }

    public Account(String id, String nama, int saldo) {
        this.id = id;
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public int kredit(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            return saldo;
        }
        return saldo;
    }

    public int debit(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return saldo;
        }
        System.out.println("Jumlah melebihi saldo");
        return saldo;
    }

    public int transferTo(Account akunLain, int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            akunLain.kredit(jumlah);
            return saldo;
        }
        System.out.println("Jumlah melebihi saldo");
        return saldo;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", saldo=" + saldo +
                ']';
    }
}