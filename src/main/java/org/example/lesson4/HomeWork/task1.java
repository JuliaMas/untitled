package org.example.lesson4.HomeWork;

import java.util.*;

import static javax.management.Query.match;
import static org.example.lesson4.ClassWork.Ex4.createList;
//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> newList = ram(n);
        System.out.println(newList);
        Stack<Integer> stackIn = new Stack<>();
        stackIn.addAll(newList);
        newList.clear();
        while (!stackIn.empty()){
            newList.add(stackIn.pop());
        }
        System.out.println(newList);
    }
    private static LinkedList<Integer> ram(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}


