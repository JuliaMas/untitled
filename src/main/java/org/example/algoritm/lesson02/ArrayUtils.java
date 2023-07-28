package org.example.algoritm.lesson02;

import java.util.Random;

/**
 * утилиты для работы с массивами
 */
public class ArrayUtils {

    private static Random random = new Random();

    /**
     * Подготовить массив случайных чисел
     *
     * @return
     */
    public static int[] prepareArray() {
        return prepareArray(random.nextInt(10, 20));
    }

    /**
     * Подготовить массив случайных чисел
     *
     * @param length
     * @return
     */
    public static int[] prepareArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-99, 100);
        }
        return array;
    }

    /**
     * Распечатать массив на экран
     *
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();

    }


}
