package org.example.OOP.lesson7.calculator.view;

import org.example.OOP.lesson7.calculator.data.Complex;
import org.example.OOP.lesson7.calculator.data.Logo;
import org.example.OOP.lesson7.calculator.data.Rational;
import org.example.OOP.lesson7.calculator.dataservis.Calculat;

import java.util.Scanner;

public class View {
    Logo logo;

    public View() {
        this.logo = new Logo();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите вариант работы(1,2,3 или 4 для выхода): " +
                    "\n" + "1.Рациональные числа" +
                    "\n" + "2.Комплексные числа" + "\n"
                    + "3.Посмотреть логи");
            int n = scanner.nextInt();
            switch (n) {
                case (1) -> usingRational();
                case (2) -> usingComplex();
                case (3) -> logo.log();
                default -> {
                    System.out.println("Работа завершена!");
                    flag = false;
                }
            }
        }
    }

    private void usingComplex() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String act = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Введите первое число ");
            Complex number1 = createComplex();
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберите действие(+, -, *, /): ");
                String act1 = scanner.nextLine();
                if (!str.contains(act1)) {
                    System.out.println("Выбранно неверное действие" + "\n" + "Попробуем снова?(1-да, 2-нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Работа завершена!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    act = act1;
                }
            }
            if (!flag) break;
            System.out.println("Введите второе число ");
            Complex number2 = createComplex();
            Calculat calculat = new Calculat();
            switch (act.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", number1, number2, calculat.sum(number1, number2));
                    logo.saveLog("Log: использован метод сложения sum(Complex1, Complex2)" +
                            calculat.sum(number1, number2).toString());
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", number1, number2, calculat.subtr(number1, number2));
                    logo.saveLog("Log: использован метод вычетания subtr(Complex1, Complex2)" +
                            calculat.subtr(number1, number2).toString());
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", number1, number2, calculat.multy(number1, number2));
                    logo.saveLog("Log: использован метод умножения multy(Complex1, Complex2)" +
                            calculat.multy(number1, number2).toString());
                }
                case ('/') -> {
                    System.out.printf("%s / %s = %s" + "\n", number1, number2, calculat.div(number1, number2));
                    logo.saveLog("Log: использован метод деления div(Complex1, Complex2)" +
                            calculat.div(number1, number2).toString());
                }
            }
            System.out.println("Продолжим вычисления?(1-да, 2- нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Работа завершена!");
                flag = false;
            }
        }
    }

    private Complex createComplex() {
        Scanner scanner = new Scanner(System.in);
        double temp = 1.0;
        double temp2 = 1.0;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите первое слагаемое(например 1,2): ");
                double n = scanner.nextDouble();
                if (n <= 0) {
                    System.out.println("Введено некорректное число" + "Продолжим вичисления?(1-да, 2- нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    temp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите второе слагаемое(например 1,2): ");
                double n3 = scanner.nextDouble();
                if (n3 <= 0) {
                    System.out.println("Введено некорректное число" + "\n" + "Продолжим вичисления?(1-да, 2- нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    temp2 = n3;
                    flag = false;
                    flag2 = false;
                }
            }
        }
        return new Complex((double) temp, (double) temp2);
    }

    private void usingRational() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String act = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Введите первое число: ");
            Rational rational1 = createRational();
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберите действие(+, -, *, /): ");
                String act1 = scanner.nextLine();
                if (!str.contains(act1)) {
                    System.out.println("Выбранно неверное действие" + "\n" + "Попробуем снова?(1-да, 2-нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Работа завершена!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    act = act1;
                }
            }
            if (!flag) break;
            System.out.println("Введите второе число: ");
            Rational rational2 = createRational();
            Calculat calculat = new Calculat();
            switch (act.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", rational1, rational2, calculat.sum(rational1, rational2));
                    logo.saveLog("Log: использован метод сложения sum(rational1, rational2)" +
                            calculat.sum(rational1, rational2).toString());
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", rational1, rational2, calculat.subtr(rational1, rational2));
                    logo.saveLog("Log: использован метод вычитания subtr(rational1, rational2)" +
                            calculat.subtr(rational1, rational2).toString());
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", rational1, rational2, calculat.multy(rational1, rational2));
                    logo.saveLog("Log: использован метод умножения multy(rational1, rational2)" +
                            calculat.multy(rational1, rational2).toString());
                }
                case ('/') -> {
                    System.out.printf("%s / %s = %s" + "\n", rational1, rational2, calculat.div(rational1, rational2));
                    logo.saveLog("Log: использован метод деления div(rational1, rational2)" +
                            calculat.div(rational1, rational2).toString());
                }
            }
            System.out.println("Продолжим вычисления?(1-да, 2- нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Работа завершена!");
                flag = false;
            }
        }
    }

    private Rational createRational() {
        Scanner scanner = new Scanner(System.in);
        int temp = 1;
        int temp2 = 1;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите числитель: ");
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Введено некорректное число" + "\n" + "Продолжим вычисления?(1-да, 2- нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    temp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите знаменатель: ");
                int n1 = scanner.nextInt();
                if (n1 <= 0) {
                    System.out.println("Введено некорректное число" + "\n" + "Продолжим вычисления?(1-да, 2- нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    temp2 = n1;
                    flag = false;
                    flag2 = false;
                }
            }
        }
        return new Rational((double) temp, (double) temp2);
    }
}
