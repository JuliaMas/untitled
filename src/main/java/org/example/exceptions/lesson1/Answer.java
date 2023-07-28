package org.example.exceptions.lesson1;

public class Answer {

    public static void arrayOutOfBoundsException() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(array[10]);
    }

    public static void divisionByZero() {
        int result = 10 / 0;
        System.out.println(result);
    }

    public static void numberFormatException() {
        String result = "Привет";
        System.out.println(Integer.parseInt(result));
    }
}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}