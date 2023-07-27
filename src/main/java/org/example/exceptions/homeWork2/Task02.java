package org.example.exceptions.homeWork2;
//Задание 2 Исправить код
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class Task02 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        error(intArray);
    }

    private static void error(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Нет элемента под индексом: 8");
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя!");
        }
    }
}


