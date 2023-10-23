package concurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent {

    public static void main(String[] args) {

        Map<Integer, String > conMap = new ConcurrentHashMap<>();

        conMap.put(1, "1");
     //   conMap.put(null, null);
//        System.out.println(conMap);

        Map<Integer, String > hashMap = new HashMap<>();

        hashMap.put(1, "1");
        hashMap.put(null, null);
        hashMap.put(1, "2");

        System.out.println(conMap);


    }
}
