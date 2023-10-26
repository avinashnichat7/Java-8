package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumCharacterOccureInString {

    public static void main(String[] args) {
        String input = "fdgydddgfgdf";


        Character character = input.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(x -> x.getKey()).get();

        System.out.println(character);
    }
}
