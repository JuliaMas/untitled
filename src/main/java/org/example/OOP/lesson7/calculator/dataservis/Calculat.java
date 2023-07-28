package org.example.OOP.lesson7.calculator.dataservis;

import org.example.OOP.lesson7.calculator.data.Complex;
import org.example.OOP.lesson7.calculator.data.Rational;

public class Calculat implements Action {

    @Override
    public Rational sum(Rational number, Rational number2) {
        if (number.num2 == number2.num2) {
            return new Rational(number2.num1 + number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 + number.num1, number2.num2 * number.num2);
        }
    }



    @Override
    public Complex sum(Complex number, Complex number2) {
        return new Complex(number.a + number2.a, number.b + number2.b);
    }

    @Override
    public Rational subtr(Rational number, Rational number2) {
        if (number.num2 == number2.num2) {
            return new Rational(number2.num1 - number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 - number.num1, number2.num2 * number.num2);
        }
    }

    @Override
    public Complex subtr(Complex number, Complex number2) {
        return new Complex(number.a - number2.a, number.b - number2.b);
    }

    @Override
    public Rational multy(Rational number, Rational number2) {
        return new Rational(number2.num1 * number.num1, number2.num2 * number.num2);
    }

    @Override
    public Complex multy(Complex number, Complex number2) {
        return new Complex((number.a * number2.a) - (number.b * number2.b),
                (number.b * number2.a) + (number2.b * number.a));
    }

    @Override
    public Rational div(Rational number, Rational number2) {
        return new Rational(number2.num1 * number.num2, number2.num2 * number.num1);
    }

    @Override
    public Complex div(Complex number, Complex number2) {
        return new Complex((number.a * number2.a + number.b * number2.b) /
                (number2.a * number2.a + number2.b * number2.b),
                (number.b * number2.a - number.a * number2.b) /
                        (number2.a * number2.a + number2.b * number2.b));
    }
}
