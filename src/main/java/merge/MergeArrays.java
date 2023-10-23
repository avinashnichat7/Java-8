package merge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        String[] s1 ={"a", "b"};
        String [] s2= {"c", "d"};


        String[] strings = Stream.concat(Arrays.stream(s1), Arrays.stream(s2))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(strings));
        System.out.println("*********merge two Arrays*************");


        int [] array1={1,2,3};
        int [] array2={4,5,6};

        Stream<Integer> integerStream1 = Arrays.stream(array1).boxed();

        Stream<Integer> integerStream2 = Arrays.stream(array2).boxed();


        Integer[] integers = Stream.concat(integerStream1, integerStream2)
                                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integers));

        System.out.println("Merge two Lists");

        List<Integer> list1 = Arrays.asList(1, 2, 3);

        List<Integer> list2 = Arrays.asList(4, 5, 6);


        List<Integer> concat = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        System.out.println(concat);
    }
}
