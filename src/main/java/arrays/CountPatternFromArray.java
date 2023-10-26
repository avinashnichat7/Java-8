package arrays;

public class CountPatternFromArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 2, 3, 4, 7, 9, 10};
        int patterncount = 0;
        int count;
        for (int i = 0; i < arr.length - 1; i++) {
            count = i;
            int pattern = arr[i] - 1;
            pattern++;
            while (arr[count] == pattern) {
                patterncount++;
                count++;
            }
            count++;
            i = count;
        }
        System.out.println(patterncount);
    }
}

