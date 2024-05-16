package no1;

import java.util.Scanner;

class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    // Method overloading untuk menerima masukan String
    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Method overloading untuk menerima masukan double
    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        double input = scanner.nextDouble();
        consumeNewLine();  // Konsumsi newline
        return input;
    }

    // Method overloading untuk menerima masukan integer
    public static int getIntegerInput(String prompt) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        consumeNewLine();  // Konsumsi newline
        return input;
    }

    // Method untuk mengonsumsi newline yang tersisa
    public static void consumeNewLine() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}