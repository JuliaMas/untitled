package org.example.OOP.lesson4.сalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String str = "3.01";
        String str1 = "3.0";
        String str2 = "3";
        List<Double> try1 = new ArrayList<>(Arrays.asList(1.1, 2.3, 4.8));
        List<Integer> try2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("calculator.mult(try1) = " + calculator.mult(try1));
        System.out.println("calculator.div(try2) = " + calculator.div(try2));
        System.out.println("calculator.transBinar(str) = " + calculator.transBinar(str));
        System.out.println("calculator.transBinar(str1) = " + calculator.transBinar(str1));
        System.out.println("calculator.transBinar(str2) = " + calculator.transBinar(str2));
    }
}
