package practice.oct_30;

public class CountDigitEvenlyDivided {
    static int evenlyDivides(int N) {

        int temp = N;
        int rem;
        int digit = 0;
        while (temp != 0) {

            rem = temp % 10;
            if ((rem != 0) && (N % rem == 0))
                digit++;
            temp = temp / 10;

        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(CountDigitEvenlyDivided.evenlyDivides(23));
    }
}
