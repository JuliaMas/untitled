package org.example.OOP.lesson5.task_hw.view;

import org.example.OOP.lesson5.task_hw.data.Komplex;
import org.example.OOP.lesson5.task_hw.data.Rational;
import org.example.OOP.lesson5.task_hw.dataServis.Calculator;

import java.util.Scanner;

public class View {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Выберите с чем работать(1 или 2, 3 для выхода): " +
                    "\n" + "1.Рациональные числа." + "\n" + "2.Комплексные числа.");
            int n = scanner.nextInt();
            switch (n) {
                case (1) -> doingRac();
                case (2) -> doingKomplex();
                default -> {
                    System.out.println("Выходим из программы");
                    flag = false;
                }
            }
        }
    }

    private void doingRac() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Введите первое число: ");
            Rational rational1 = creatRacional();
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                if (!str.contains(doing1)) {
                    System.out.println("Вы ввели неверное значение" + "\n" + "Еще раз попробуем?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Работа завершена");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    doing = doing1;
                }
            }
            if (!flag) break;
            System.out.println("Введите второе число: ");
            Rational rational2 = creatRacional();
            Calculator calculat = new Calculator();
            switch (doing.charAt(0)) {
                case ('+') ->
                        System.out.printf("%s + %s = %s" + "\n", rational1, rational2, calculat.sum(rational1, rational2));
                case ('-') ->
                        System.out.printf("%s - %s = %s" + "\n", rational1, rational2, calculat.raznoct(rational1, rational2));
                case ('*') ->
                        System.out.printf("%s * %s = %s" + "\n", rational1, rational2, calculat.multy(rational1, rational2));
                case ('/') ->
                        System.out.printf("%s : %s = %s" + "\n", rational1, rational2, calculat.div(rational1, rational2));
            }
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Работа завершена!");
                flag = false;
            }
        }
    }

    private void doingKomplex() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Введите первое число: ");
            Komplex number1 = creatkomplex();
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                if (!str.contains(doing1)) {
                    System.out.println("Вы ввели неверное значение" + "\n" + "Еще раз попробуем?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Работа завершена!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    doing = doing1;
                }
            }
            if (!flag) break;
            System.out.println("Введите  второе число: ");
            Komplex number2 = creatkomplex();
            Calculator calculat = new Calculator();
            switch (doing.charAt(0)) {
                case ('+') ->
                        System.out.printf("%s + %s = %s" + "\n", number1, number2, calculat.sum(number1, number2));
                case ('-') ->
                        System.out.printf("%s - %s = %s" + "\n", number1, number2, calculat.raznoct(number1, number2));
                case ('*') ->
                        System.out.printf("%s * %s = %s" + "\n", number1, number2, calculat.multy(number1, number2));
                case ('/') ->
                        System.out.printf("%s : %s = %s" + "\n", number1, number2, calculat.div(number1, number2));
            }
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Работа завершена!");
                flag = false;
            }
        }
    }

    private Rational creatRacional() {
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        int tmp2 = 1;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите числитель: ");
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите знаменатель: ");
                int n1 = scanner.nextInt();
                if (n1 <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp2 = n1;
                    flag = false;
                    flag2 = false;
                }
            }
        }
        return new Rational(tmp, tmp2);
    }

    private Komplex creatkomplex() {
        Scanner scanner = new Scanner(System.in);
        double tmp = 1.0;
        double tmp2 = 1.0;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите первое слагаемое(например - 1,2): ");
                double n = scanner.nextDouble();
                if (n <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите второе слагаемое(например - 1,3): ");
                double n3 = scanner.nextDouble();
                if (n3 <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp2 = n3;
                    flag = false;
                    flag2 = false;
                }
            }

        }
        return new Komplex(tmp, tmp2);
    }
}
