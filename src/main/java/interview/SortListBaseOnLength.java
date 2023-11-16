package interview;

import java.util.*;

public class SortListBaseOnLength {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> strings = Arrays.asList("Avinash", "Suresh", "Manish", "Aman", "Kailash");

        list.add("Avinash");
        list.add("Suresh");
        list.add("Manish");
        list.add("Aman");
        list.add("Kailash");


        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

        System.out.println(list);

    }
}


//        Collections.sort(list, Comparator.comparing(String::length));
//
//        for (String s : list) {
//            System.out.println(s + "");

//        }

       /* List<String> collect = strings.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());

        System.out.println(collect);
    }*/
