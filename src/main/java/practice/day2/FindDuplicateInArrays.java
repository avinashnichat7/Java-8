package practice.day2;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateInArrays {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        List<Integer> collect = Arrays.stream(arr)
                .boxed().collect(Collectors.toList());


        List<Integer> integers = collect.stream()
                .filter(x -> !set.add(x))
                .collect(Collectors.toList());


        return (ArrayList<Integer>) integers;

    }

    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(1, 2, 3, 3, 5);
        int[] arr = {1, 2, 3, 3, 5};

        int size = arr.length;
        System.out.println(FindDuplicateInArrays.duplicates(arr, size));

//        Set<Integer> collect = integers.stream()
//                .filter(x -> Collections.frequency(integers, x) > 1)
//                .collect(Collectors.toSet());


    }
}
