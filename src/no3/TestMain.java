package no3;

public class TestMain {

    public static void main(String[] args) {
        // Uji konstruktor dan toString()
        Account a1 = new Account("A101", "Nanang", 88);
        System.out.println(a1); // toString();
        Account a2 = new Account("A102", "Oneng"); // saldo default
        System.out.println(a2); // Uji Getter
        System.out.println("ID: " + a1.getId());
        System.out.println("Nama: " + a1.getNama());
        System.out.println("Saldo: " + a1.getSaldo()); // Uji kredit() dan debit()
        a1.kredit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1); // Uji transfer()
        a1.transferTo(a2, 100); // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}