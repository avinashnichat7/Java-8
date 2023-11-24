package apiStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Longest_String_Given_Array {

    public static void main(String[] args) {
        String[] array = {"spring, spingboot, microsoft,microservices, java"};

        String findLongestLengthString = Arrays.stream(array)
                .reduce((a1, a2) -> a1.length() > a2.length() ? a1 : a2)
                .get();

        System.out.println(findLongestLengthString);
        System.out.println("*********************************************************************");


        String findFirstLongestString = Arrays.stream(array)
                .sorted(Comparator.comparing(String::length)
                        .reversed())
                .findFirst().get();

        System.err.println("findFirstLongestString = " + findFirstLongestString);

        String findSecondLargestString = Arrays.stream(array)
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .limit(1)
                .findFirst().get();
        System.out.println("findSecondLargestString"+ findSecondLargestString);


        System.err.println("find the  whose start with 1");


        int n[] = {1, 2, 3, 4, 5, 6, 7, 11};


        List<String> strings = Arrays.stream(n)
                .boxed().map(x->String.valueOf(x))
                .filter(x -> x.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(strings);


        List<String> list = Arrays.asList("spring", "spingboot", "microsoft", "microservices", "java");

        List<String> sortBylength = list.stream().sorted((s1, s2) -> s1.length() - s2.length()).collect(Collectors.toList());
        System.out.println("sortBylength" + sortBylength);

        String findLongStringFromList = list.stream()
                .reduce((x1, x2) -> x1.length() > x2.length() ? x1 : x2)
                .get();

        System.out.println(findLongStringFromList);

    }
}
