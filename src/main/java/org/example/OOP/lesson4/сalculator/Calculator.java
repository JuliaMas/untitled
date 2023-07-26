package org.example.OOP.lesson4.сalculator;

import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double mult(List<? extends Number> numbers) {
        double result = 1.0;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double div(List<? extends Number> numbers) {
        double result = 1.0;
        for (Number number : numbers) {
            result /= number.doubleValue();
        }
        return result;
    }

    public String transBinar(String strNum) {
        double number = Double.parseDouble(strNum);
        int firstNum = (int) number;
        double lastNum = number % firstNum;
        int count = 0;
        for (String s : strNum.split("")) {
            if (s.charAt(0) == '.') {
                count++;
            }
        }
        if (count == 0) {
            return Integer.toBinaryString(firstNum);
        } else {
            if (lastNum == 0) {
                return Integer.toBinaryString(firstNum);
            } else {
                return Integer.toBinaryString(firstNum) + "," +
                        Long.toBinaryString(Double.doubleToRawLongBits(lastNum));
            }
        }
    }
}
