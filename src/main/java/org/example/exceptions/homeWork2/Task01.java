package org.example.exceptions.homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task01 {
    public static void main(String[] args) {
        enterFloat();
    }

    private static void enterFloat() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float result = getFloatFromUser(bufferedReader);
            bufferedReader.close();
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при работе с файлом");
            return;
        }
    }

    private static float getFloatFromUser(BufferedReader bufferedReader) {
        System.out.println("Введите число(тип числа должен быть float!!!): ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Данное число не соответствует заданному типу!");
            return getFloatFromUser(bufferedReader);
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
            return getFloatFromUser(bufferedReader);
        }
        return result;
    }
}
