package apiStream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxReapeatedCharacter {
    public static void main(String[] args) {

        String name = "FindMaxReapeatedCharacter";

        Character character = name.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        System.out.println(character);

        Character key = name.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow().getKey();

        System.out.println(key);
    }
}
