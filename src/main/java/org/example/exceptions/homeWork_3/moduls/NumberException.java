package org.example.exceptions.homeWork_3.moduls;

public class NumberException extends NumberFormatException {
    public NumberException() {
        super("Это не цифра!");
    }
}
