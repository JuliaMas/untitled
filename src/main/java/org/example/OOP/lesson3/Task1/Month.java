package org.example.OOP.lesson3.Task1;

public enum Month {
    JAN, FEB, MR, APR(4), MAY, JUNE,JUL, AUG, SEPT, OKT, NOV, DES;
private  int number;
    Month() {
    }

    Month(int number) {
        this.number = number;
    }
}
