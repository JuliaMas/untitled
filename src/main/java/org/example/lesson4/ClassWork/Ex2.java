package org.example.lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
        // Посторить однонаправленный список целых чисел. Найти сумму четных элементов
        int sum = 0;
        for (Integer el : linkedList) {
            if (el % 2 == 0) sum += el;
        }
        System.out.println("sum = " + sum);
    }

    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;

    }
}
