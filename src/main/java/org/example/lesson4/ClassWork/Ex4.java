package org.example.lesson4.ClassWork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, -3, -2, -1, 4, 5, -6, 7));
        System.out.println("linkedList = " + linkedList);
        remElem(linkedList);
    }
// Построить однонаправленный список цылых чисел. Удалить отрицательные элементы списка.
    private static void remElem(LinkedList<Integer> linkedList) {
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            if (linkedList.get(i) < 0) {
                linkedList.remove(i);
            }
        }
        System.out.println("linkedList = " + linkedList);
    }

    /**
     * @param n количество элементов в созданном списке
     * @return новый список
     */
    public static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}

