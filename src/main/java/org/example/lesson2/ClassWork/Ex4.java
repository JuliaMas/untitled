package org.example.lesson2.ClassWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("zadanie4(mass) = " + zadanie4(mass));
    }

    /**
     * @param mass входящий массив
     * @return рез-тат
     * @apiNote 3)Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     */
    private static int zadanie4(int[] mass) {
        int k = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == mass[i + 1] * 2) {
                k++;
            }
        }
        return k;
    }
    }

