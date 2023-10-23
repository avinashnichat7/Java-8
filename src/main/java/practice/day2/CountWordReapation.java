package practice.day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordReapation {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "a", "c");

        Map<String, Long> count = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(count);


        System.out.println("other way");

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(count);


        String[] strings = {"a", "b", "c", "d", "a", "c"};

        Map<String, Long> collect1 = Arrays.asList(strings).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

    }
}
