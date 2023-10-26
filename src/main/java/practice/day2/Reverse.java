package practice.day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse {
    public static String reverseWord(String str) {
        int length = str.length();

        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String name = "Avinash";
        String[] split = name.split("");


        System.out.println(reverseWord(name));


    }
}
