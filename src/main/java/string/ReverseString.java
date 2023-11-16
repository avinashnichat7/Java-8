package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello world";

        StringBuilder stringBuilder = new StringBuilder(str);

        StringBuilder reverse = stringBuilder.reverse();

        System.out.println(reverse);
        System.err.println("******************************************");

        String[] split = str.split("");
        String reverseStringByword = Arrays.asList(split)
                .stream()
                .map(x -> new StringBuilder(x).reverse())
                .collect(Collectors.joining());


        System.err.println("reverseStringBy =" + reverseStringByword);
        System.err.println("*********************************");
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }

        System.err.println(" reverse String ");
        System.out.println(rev);


        String name = "hello world";

        String collect = Arrays.asList(name.split(name)).stream().map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining());

        System.out.println(collect);


        String collect1 = Arrays.asList(name.split("")).stream()
                .map(x -> new StringBuilder(x).reverse())
                .collect(Collectors.joining());

    }
}
