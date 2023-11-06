package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.coyote.http11.Constants.a;

public class Sample {
    public static void main(String[] args) {


        Map<String, Object> map = new HashMap<>();

//        map.put("1", 2);
//        map.put("2", "Abc");
//        map.forEach((x, v) -> System.out.println(x + " : " + v));
//
//        map.forEach((x, v) -> {
//            System.out.println(x + " : " + v);
//        });
//

//        HashSet hashMap = new HashSet();
//
//        hashMap.add(null);
////        hashMap.add(null);
//        System.out.println("hashMap"+ hashMap);
//


        TreeSet set = new TreeSet();
        set.add(1);
        set.add("1");
        set.add(null);
        System.out.println(set);
    }


}
