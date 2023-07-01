package org.example.lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //1)Посчитать количество вхождений каждого символа в текст.
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "qwewqe asdasd weqrqwe easda ew";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                mapCh.putIfAbsent(str.charAt(i),0);
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//                if (!mapCh.containsKey(str.charAt(i))) {
//                    mapCh.put(str.charAt(i), 1);
//                } else {
//                    mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//                }
            }
        }
        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}
