package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        System.out.println("task03(mass) = " + task03(mass));
        for (int i = 0; i < n; i++) {
            System.out.println(mass[i] + " ");
        }

    }

    /**
     * @param mass входной массив
     * @return получившийся массив
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */
    private static int task03(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i]) >= 10 && Math.abs(mass[i]) <= 99) {
                sum += i;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                mass[i] = sum;
            }
        }
        return sum;
    }
}
