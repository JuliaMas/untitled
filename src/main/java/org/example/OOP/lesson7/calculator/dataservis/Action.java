package org.example.OOP.lesson7.calculator.dataservis;

import org.example.OOP.lesson7.calculator.data.Complex;
import org.example.OOP.lesson7.calculator.data.Rational;

public interface Action {
    Rational sum(Rational num, Rational num2);

    Complex sum(Complex num, Complex num2);

    Rational subtr(Rational number, Rational number2);

    Complex subtr(Complex number, Complex number2);

    Rational multy(Rational number, Rational number2);

    Complex multy(Complex number, Complex number2);

    Rational div(Rational number, Rational number2);

    Complex div(Complex number, Complex number2);
}
