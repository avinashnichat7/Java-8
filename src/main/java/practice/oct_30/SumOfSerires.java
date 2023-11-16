package practice.oct_30;

public class SumOfSerires {
    public static void main(String[] args) {
        int n = 123;
        SumOfSerires sumOfSerires = new SumOfSerires();
        System.out.println(sumOfSerires.seresSum(n));
    }

    public long seresSum(int n) {

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
