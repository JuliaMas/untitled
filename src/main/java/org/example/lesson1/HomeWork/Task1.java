package org.example.lesson1.HomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("task1(str) = " + task1(str));
    }
    /**
     * @param str first string
     * @return reverse words
     * @apiNote Reverse Words in a String
     */
    private static String task1(String str) {
        List<String> words = Arrays.asList(str.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

