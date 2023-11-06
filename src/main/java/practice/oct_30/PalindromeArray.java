package practice.oct_30;

public class PalindromeArray {
    public static int palinArray(int[] a, int n) {

        int rem;
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            int rev = 0;

            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;

            }
            if (a[i] != rev) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        int[] array = {111, 222, 333, 444, 555};
        int length = array.length;
        System.out.println(PalindromeArray.palinArray(array, length));
    }
}
