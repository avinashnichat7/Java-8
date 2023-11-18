package apiStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        List<Integer> integers1 = Arrays.asList(4, 5, 6);

        List<Integer> finalList = Stream.concat(integers.stream(), integers1.stream()).collect(Collectors.toList());
        System.out.println(finalList);

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        Stream<Integer> boxed1 = Arrays.stream(a1).boxed();

        Stream<Integer> boxed2 = Arrays.stream(a2).boxed();

        Integer[] mergeArrays = Stream.concat(boxed1, boxed2).toArray(Integer[]::new);

        System.out.println(mergeArrays);

    }
}
