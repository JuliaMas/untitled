package org.example.lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 6, 1, 4));
        System.out.println(arr);
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        System.out.println("averege(arr) = " + averege(arr));
    }

    /**
     * @param arr заданный список
     * @return среднеарифметичесское
     * @apiNote Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     */
    private static double averege(ArrayList<Integer> arr) {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum / arr.size();
    }
}


