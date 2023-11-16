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

    }
}
