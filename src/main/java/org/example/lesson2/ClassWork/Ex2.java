package org.example.lesson2.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] resArr = numberSum(array);

        for (int el: resArr) {
            System.out.print(el + " ");

        }
    }

    /**
     * @apiNote Задан массив . Мы определяем промежуточную сумму массива
     * как .numsrunningSum[i] = sum(nums[0]…nums[i])
     * @param array массив чисел
     * @return Возвращает промежуточную сумму .nums
     */
    private static int[] numberSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
