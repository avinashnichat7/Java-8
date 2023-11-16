package practice.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (i != 0 && arr[i - 1] == arr[i]) {
                    continue;
                }
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}
