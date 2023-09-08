package org.example.algoritm.lesson04;

import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("AAA", 30);
        System.out.println(employee1.hashCode());

        HashMap<String, String> hashMap = new HashMap<>(4);


        String v = hashMap.put("+79871234525", "Alex");
        v = hashMap.put("+1234256786", "Sergey");
        v = hashMap.put("+1234256786", "Igor");
        v = hashMap.put("+79871234526", "Alex1");
        v = hashMap.put("+79871234527", "Alex2");
        v = hashMap.put("+79871234528", "Alex3");
        v = hashMap.put("+79871234529", "Alex4");
        v = hashMap.put("+79871234530", "Alex5");

        String searchRes = hashMap.get("+79871234528");

        v = hashMap.remove("+79871234527");


        for (Object value : hashMap) {
            System.out.println(value);
        }
    }
}


