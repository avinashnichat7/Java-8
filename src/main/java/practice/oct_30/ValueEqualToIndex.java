package practice.oct_30;

import java.util.ArrayList;

public class ValueEqualToIndex {
    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        int n = arr.length;
        ValueEqualToIndex value = new ValueEqualToIndex();
        System.out.println(value.valueEqualToIndex(arr, n));
    }

    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {

                result.add(i + 1);
            }
        }
        return result;
    }
}
