package org.example.lesson1.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int prenum = 0;
        boolean foundNerative = false;
        System.out.println("Введите число ");
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                foundNerative = true;
            }
            if (foundNerative) {
                sum += prenum;
                foundNerative = false;
            }
            prenum = num;
        }
        System.out.println("Сумма положительных чисел равна " + sum);

    }
}
//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//Пример ввода:
//1 2 1 2 -1 1 3 1 3 -1 0