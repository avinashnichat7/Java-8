package practice.day2;

import com.sun.jdi.LongValue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.LongStream;

public class AtleastTwoGreaterElement {

    public static void main(String[] args) {
        AtleastTwoGreaterElement test = new AtleastTwoGreaterElement();
        long[] a = {2, 8, 7, 1, 5};
        int length = a.length;

        test.findElements(a, length);
    }

    public void
    findElements(long a[], long n) {

        LongStream stream = Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .mapToLong(x -> x);

    }
}