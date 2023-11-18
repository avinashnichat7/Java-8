package apiStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReapetedFirstCharacterFromString {

    public static void main(String[] args) {

        String input = "avinassh";


        Character character = input.chars()
                .mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).findFirst().get();


        System.out.println("first non repeated character " + character);


        input.chars()
                .mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .findFirst()
                .ifPresent(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 2);


        Set<Integer> collect = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.toSet());

//        System.out.println(collect);


        HashSet<Integer> set = new HashSet();

        List<Integer> findDuplicates = list.stream()
                .filter(x -> !set.add(x))
                .collect(Collectors.toList());

//        System.out.println(findDuplicates);

        String name = "dehgfdsfdxv";


        List<Character> collect1 = name.chars().mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).collect(Collectors.toList());


        String[] split = name.split("");

        Map<String, Long> countOccance = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> nonRepeatedFirstCharacter = countOccance.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get();

        System.out.println("nonRepeatedFirstCharacter =" + nonRepeatedFirstCharacter);


        String n= "avinash";
        Character findfirst = n.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .map(x -> x.getKey()).findFirst().get();

        System.err.println("find >" + findfirst);

    }


}
