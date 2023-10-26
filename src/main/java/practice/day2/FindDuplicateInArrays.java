package practice.day2;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateInArrays {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here


        List<Integer> collect = Arrays.stream(arr)
                .boxed().collect(Collectors.toList());


        Set<Integer> integers = collect.stream()
                .filter(x -> Collections.frequency(collect, x) > 1)
                .collect(Collectors.toSet());

        return (ArrayList<Integer>) integers;

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 3, 5);


        Set<Integer> collect = integers.stream()
                .filter(x -> Collections.frequency(integers, x) > 1)
                .collect(Collectors.toSet());


    }
}
