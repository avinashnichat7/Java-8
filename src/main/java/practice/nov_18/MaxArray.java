package practice.nov_18;
/*
  Calculate the maximum sum of 3 consecutive elements in the array.
          create sub-Array of 3 elements.
  Expected Output – max sum value and what are the element of that sub-array
*/

import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};

        int numberOfParts = arr.length / 3;

        int[] part1 = Arrays.copyOfRange(arr, 0, numberOfParts);


        System.out.println(Arrays.toString(part1));

        int sum = 0;
        for (int i = 0; i < part1.length; i++) {



            sum = sum + part1[i];

        }
        System.out.println(sum);


    }
}
