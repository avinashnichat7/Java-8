package practice.nov_24;

import java.util.Scanner;

public class ReverseString {

    public static String reverseWord(String str) {

        int length = str.length();
        String rev = "";
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.next();

        System.out.printf(ReverseString.reverseWord(input));
    }
}
