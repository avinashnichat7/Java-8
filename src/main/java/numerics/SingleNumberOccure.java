package numerics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumberOccure {
    public static void main(String[] args) {
        SingleNumberOccure singleNumberOccure = new SingleNumberOccure();
        int[] nums = {1, 2, 3, 2, 1, 4};

        System.out.println(singleNumberOccure.singleNumber(nums));
    }

    public int[] singleNumber(int[] nums) {
        List<Integer> collect = Arrays.stream(nums)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        int[] ints = collect.stream().mapToInt(x -> x).toArray();
        return ints;

    }
}
