package practice.nov_24;

import java.util.Arrays;

public class CheckArraysEqualNot {
    public static boolean check(long A[], long B[], int N) {

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long[] a = {1, 2, 5, 4, 0};

        long[] b = {2, 4, 5, 0, 1};

        int length = a.length;
        System.out.println(CheckArraysEqualNot.check(a, b, length));
    }
}
