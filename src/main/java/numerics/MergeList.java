package numerics;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("1", "2");
        List<String> l2 = Arrays.asList("3", "4");

        // merge two lists using the collectors list

        List<String> collect = Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        List<String> stringList = Stream.concat(l1.stream(), l2.stream()).toList();

        //using   addAll
        List<String> list = new ArrayList<>();

        list.addAll(l1);
        list.addAll(l2);

        // set method used to change elements of the 1st index
        list.set(1, "5");
        System.out.println(list);

        //using asList return

        List<List<String>> lists = Arrays.asList(l1, l2);
        System.out.println(lists);


        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10, 11, 12, 13, 14};

        Stream<Integer> stream1 = Arrays.stream(a).boxed();

        Stream<Integer> stream2 = Arrays.stream(b).boxed();

        //return int array;
        Integer[] integers = Stream.concat(stream1, stream2).toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));


        String[] s1 = {"a", "b", "c", "d", "e"};
        String[] s2 = {"f", "g", "h", "i", "j", "k"};

        String[] strings = Stream.concat(Arrays.stream(s1), Arrays.stream(s2))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(strings));

//        for (String s : strings) {
//            System.out.println(s);
//        }
    }
}
