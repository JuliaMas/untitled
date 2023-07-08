package org.example.lesson5.HomeWork;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = AllNB.addData();
        System.out.println(notebooks);
        System.out.println("\n Введите критерий отбора: \n" +
                "1. название\n" +
                "2. диагональ экрана\n" +
                "3. цвет ноутбука\n" +
                "4. операционная система\n" +
                "5. объем оперативной памяти\n" +
                "0. закончить отбор");
        parameterSelection(notebooks);

    }

    private static void parameterSelection(List<Notebook> notebooks) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != 0) {
            switch (num) {
                case 1 -> {
                    System.out.println("Введите название: ");
                    String temp = in.next().trim();
                    notebooks = Selection.selectionName(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 2 -> {
                    System.out.println("Введите диагональ экрана: ");
                    String temp = in.next().trim();
                    notebooks = Selection.selectionScreen(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 3 -> {
                    System.out.println("Введите цвет: ");
                    String temp = in.next().trim();
                    notebooks = Selection.selectionColor(notebooks, temp);
                    System.out.println(notebooks);

                }
                case 4 -> {
                    System.out.println("Введите операционную систему: ");
                    String temp = in.next().trim();
                    notebooks = Selection.selectionOS(notebooks, temp);
                    System.out.println(notebooks);
                }
                case 5 -> {
                    System.out.println("Введите объем RAM: ");
                    String temp = in.next().trim();
                    notebooks = Selection.selectionRAM(notebooks, temp);
                    System.out.println(notebooks);
                }
                default -> {
                    System.out.println("Такой параметр отбора отсутствует!");
                }
            }
            System.out.println("Следующий параметр отбора: ");
            num = in.nextInt();
        }
    }
}

