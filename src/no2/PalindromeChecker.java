package no2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan string
        System.out.println("Masukkan string: ");
        String input = scanner.nextLine();

        // Memanggil fungsi untuk memeriksa apakah string adalah palindrom
        boolean isPalindrome = isPalindrome(input);

        // Menampilkan hasil
        if (isPalindrome) {
            System.out.println("String tersebut adalah palindrom.");
        } else {
            System.out.println("String tersebut bukan palindrom.");
        }

        scanner.close();
    }

    // Fungsi untuk memeriksa apakah string adalah palindrom
    public static boolean isPalindrome(String str) {
        // Mengubah string menjadi huruf kecil dan menghapus spasi
        str = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = str.length() - 1;

        // Memeriksa karakter dari kedua ujung string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Jika tidak sama, bukan palindrom
            }
            left++;
            right--;
        }
        return true; // Jika semua karakter cocok, itu adalah palindrom
    }
}