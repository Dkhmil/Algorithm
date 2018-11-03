package khmil;

import java.util.Scanner;

public class Frequency {
    private static Scanner a = new Scanner(System.in);

    public static String getString() {
        System.out.print("Enter String: ");
        String input = a.nextLine();
        return input;
    }

    public static char getChar() {
        System.out.print("Enter char: ");
        char symbol = a.nextLine().charAt(0);
        return symbol;
    }

    public static void Counting(String str, char symb) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (symb == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Frequency: " + count);
    }

    public static void main(String[] args) {
        Counting(getString(), getChar());
    }

}