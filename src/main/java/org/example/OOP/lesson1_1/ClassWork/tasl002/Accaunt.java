package org.example.OOP.lesson1_1.ClassWork.tasl002;

public class Accaunt {
    private String owner;
    private Integer number;
    private Double balance;

    public Accaunt() {

    }

    public Accaunt(String owner, int number, Double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else System.out.println("Недостаточно средств\n остаток на счете " + balance);
    }

    @Override
    public String toString() {
        return "Accaunt{" + "numder=" + number + ", owner='" + owner + '\'' + ", balance=" + balance + '}';
    }

}
