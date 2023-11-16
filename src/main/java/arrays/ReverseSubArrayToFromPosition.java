package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSubArrayToFromPosition {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> list = Arrays.asList(array);

        List<Integer> subList = list.subList(2, 5);

        Collections.reverse(subList);

        System.out.println(list);
    }

}
