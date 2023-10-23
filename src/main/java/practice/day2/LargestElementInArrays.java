package practice.day2;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElementInArrays {
    public static void main(String[] args) {
        int[] array = {1, 8, 7, 56, 90};

        int n = array.length;

        LargestElementInArrays obj = new LargestElementInArrays();
        System.out.println(obj.largest(array, n));
    }

    public int largest(int[] array, int n) {
        Integer integer = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
        return integer;
    }

}
