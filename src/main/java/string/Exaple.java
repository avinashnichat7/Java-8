package string;

import java.util.*;

public class Exaple {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        LinkedList<Integer> list2 = new LinkedList<>();

        AbstractMap<Integer, String> IdentityHashMap = new AbstractMap<Integer, String>() {
            @Override
            public Set<Entry<Integer, String>> entrySet() {
                return null;
            }
        };
        for (int i = 1; i < 5; i++) {

            list.add(i);
            list2.add(i);

        }
        System.out.println(list);

        System.out.println("this is linkList: " + list2);
    }

}
