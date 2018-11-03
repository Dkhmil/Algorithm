package khmil;

import java.util.Scanner;

public class Palindrome {

    public static String getWord() {
        Scanner a = new Scanner(System.in);
        System.out.print("enter your word: ");
        String input = a.nextLine();
        return input;
    }

    public static void cheсkingPalindrome(String s) {
        boolean t = true;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                t = false;
            }
        }
        if (t) {
            System.out.println("is palindrome");
        } else {
            System.out.println("isn't palindrome");
        }
    }

    public static void main(String[] args) {
        cheсkingPalindrome(getWord());
    }
}

