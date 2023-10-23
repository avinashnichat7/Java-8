package assesment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLargestNum {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 21, 43, 12);


        Integer integer = integers.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst().get();

        System.out.println(integer);
    }
}
