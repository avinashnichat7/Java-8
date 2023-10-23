package practice.day2;


import ch.qos.logback.core.joran.sanity.Pair;

import java.util.Arrays;

public class RemoveSpace {

    public static void main(String[] args) {
        RemoveSpace s = new RemoveSpace();
        System.out.println(s.modify("geeks  for geeks"));
    }

    String modify(String S) {
        char[] chars = S.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ' ') {
                continue;
            }
            sb.append(chars[i]);

        }
        return new String(sb);

//            String s = S.replaceAll(" ", "");
//        return s;


    }
}
