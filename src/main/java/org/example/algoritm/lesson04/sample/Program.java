package org.example.algoritm.lesson04.sample;

import java.util.HashMap;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        String v = hashMap.put("+79871234525", "Alex");
        v = hashMap.put("+1234256786", "Sergey");
        v = hashMap.put("+1234256787", "Igor");
        v = hashMap.put("+1234256788", "Igor2");
        v = hashMap.put("+1234256789", "Igor3");
        v = hashMap.put("+1234256790", "Igor4");


        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println("________");
        }
    }
}
