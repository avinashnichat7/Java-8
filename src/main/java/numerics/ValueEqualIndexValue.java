package numerics;

import java.util.ArrayList;

public class ValueEqualIndexValue {
    public static void main(String[] args) {
        ValueEqualIndexValue object = new ValueEqualIndexValue();
        int arr[] = {15, 2, 45, 12, 7};

        int n = arr.length;
        System.out.println(object.valueEqualToIndex(arr, n));
    }

    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

        ArrayList<Integer> equalToIndex = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {

                equalToIndex.add(arr[i]);
            }
        }

        return equalToIndex;

    }
}
