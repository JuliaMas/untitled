package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int n = scanner.nextInt();
        System.out.println("task01(n, scanner) = " + task01(n, scanner));
    }
    /**
     * @param n       длина последовательности
     * @param scanner scanner
     * @return сумма простых чисел
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    private static int task01(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            if (n1 <= 3 && n1 != 0) {
                sum += n1;
            } else {
                int temt = 0;
                for (int j = 2; j < n1; j++) {
                    if (n1 % j == 0) {
                        temt++;
                    }
                }
                if (temt == 0) {
                    sum += n1;
                }
            }
        }
        return sum;
    }
}



