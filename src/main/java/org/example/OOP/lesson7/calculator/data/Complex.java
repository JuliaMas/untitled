package org.example.OOP.lesson7.calculator.data;

public class Complex extends Numbers {
    public double a;
    public double b;

    public Complex(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("%f + %fi", a, b);
    }
}
