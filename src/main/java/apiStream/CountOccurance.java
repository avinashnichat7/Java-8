package apiStream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {
    public static void main(String[] args) {

        String name = "efgdsadfesawdhefbaz";

        String[] split = name.split("");


        System.err.println("count Character repeatation");

        Map<String, Long> countOccurance = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countOccurance);

        List<String> findDuplicates = countOccurance.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.err.println("find the duplication element from the given String");
        System.out.println(findDuplicates);

        List<String> uniqueElement =
                countOccurance.entrySet().stream()
                        .filter(x -> x.getValue() == 1)
                        .map(x -> x.getKey())
                        .collect(Collectors.toList());
        System.out.println("fint the unqiue element from the given String - " + uniqueElement);

        String[] s = name.split("");

        LinkedHashMap<String, Long> counts = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new
                , Collectors.counting()));

        String key = counts.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .findFirst()
                .get()
                .getKey();


        System.out.println("find the first Duplicate element in the String -  ");
        System.out.println(key);


        int arrays[] = {1, 2, 3, 4, 5, 6, 7, 9};

        int expected_length = arrays.length + 1;

        int sum = expected_length * (expected_length + 1) / 2;

        int sum2 = 0;

        for (int i = 0; i < arrays.length; i++) {

            sum2 = sum2 + arrays[i];


        }
        System.out.println((sum - sum2));




    }


}
