package org.example.exceptions.homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task04 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean isContinue = true;
            while (isContinue) {
                try {
                    System.out.println("Введите строку");
                    String text = getTextFromUser(bufferedReader);
                    System.out.println(text);
                    isContinue = false;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка при работе с консолью");
        }
    }

    private static String getTextFromUser(BufferedReader bufferedReader) throws IOException {
        String text = bufferedReader.readLine();

        if (text.isEmpty()) {
            throw new RuntimeException("Введена пустая строка");
        }
        return text;
    }
}
