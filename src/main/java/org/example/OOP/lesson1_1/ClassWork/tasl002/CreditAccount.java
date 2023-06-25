package org.example.OOP.lesson1_1.ClassWork.tasl002;

public class CreditAccount extends Accaunt {
    private double degreePercent;

    public CreditAccount(String owner, int number, double balance, double degreePercent) {
        super(owner, number, balance);
        this.degreePercent = degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }

    public void calculateInteresr() {
        double result = getBalance() * degreePercent / 100;
        withdraw(result);
    }
}
