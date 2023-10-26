package practice.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {
    public static void main(String[] args) {
        String name = "efgdsadfesawdhefbaz";

        String[] split1 = name.split("");

        List<String> stringList = Arrays.asList(split1);

        Map<String, Long> countOccurances = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("countOcc" + countOccurances);


        System.out.println("find duplicates elements");

        List<String> collect = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(x -> x.getKey())
                .collect(Collectors.toList());


        System.err.println("duplicate entry from string" + collect);


        System.out.println("find first deuplicate element");

        String s = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(x -> x.getKey())
                .findFirst().get();

        System.out.println(s);


        String firstNorepeatedFirst = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .findFirst().get();

        System.out.println("firstNonReapeatedFirst" + firstNorepeatedFirst);
    }
}
