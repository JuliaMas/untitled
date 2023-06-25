package org.example.lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);

        /*System.out.println("linkedList = " + linkedList);
        scanner.close();
        System.out.println("linkedList.peek() = " + linkedList.peek()); //
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.pop() = " + linkedList.pop());// убирает элемент
        System.out.println("linkedList = " + linkedList);
        linkedList.push(2);
        System.out.println("linkedList = " + linkedList); //добавляет элемент
        linkedList.add(3);
        linkedList.addLast(4);
        linkedList.addFirst(6);
        System.out.println("linkedList = " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList = " + linkedList);
        linkedList.contains(3);// проверка есть ли элемент по индексу*/
    }

    /**
     * @param n количество элементов
     * @return новый список
     */
    private static LinkedList createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}
