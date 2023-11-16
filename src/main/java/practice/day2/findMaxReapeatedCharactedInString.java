package practice.day2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findMaxReapeatedCharactedInString {
    public static void main(String[] args) {

        String name = "jvvvvvaaavvvdfgdfgdgfffffffffffffffhhhhhhhhhhhhhhhhhhhhhh";


        Character key = name.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max((x, v) -> x.getValue().compareTo(v.getValue() - x.getValue()))
                .orElseThrow()
                .getKey();
        System.out.println(key);


        Character maximumReapetedCharacter = name.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow().getKey();


        System.out.println(maximumReapetedCharacter);

    }
}
