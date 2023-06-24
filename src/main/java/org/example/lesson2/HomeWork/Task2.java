package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int n = scanner.nextInt();
        System.out.println("checkInt(n, scanner) = " + checkInt(n, scanner));
    }

    /**
     * @param n       длина последовательности
     * @param scanner сканнер
     * @return возрастающая или нет
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей
     */
    private static boolean checkInt(int n, Scanner scanner) {
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n2 < n1) {
                return false;
            }
            n1 = n2;
        }
        return true;
    }
}
