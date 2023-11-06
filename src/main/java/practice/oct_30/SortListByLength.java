package practice.oct_30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "abcd", "abcdef", "fdgd", "cfg");

        List<String> collect1 = list.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());

        System.out.println("length" + collect1);


        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
        System.out.println(list);

        Collections.sort(list, Comparator.comparing(String::length));
        System.err.println("list: " + list);


        List<String> collect = list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
        for (String sortbaseOnLength : collect) {

            System.err.println(sortbaseOnLength);
        }




    }
}
