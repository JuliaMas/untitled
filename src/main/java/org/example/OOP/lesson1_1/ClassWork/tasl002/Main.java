package org.example.OOP.lesson1_1.ClassWork.tasl002;

public class Main {
    public static void main(String[] args) {
        CreditAccount credit = new CreditAccount("Иван Иванов", 123451, 1000, 10.0);
        SafeAccaunt safe = new SafeAccaunt("Иван Иванов", 34561, 3000, 10);
        System.out.println(credit.getBalance());
        credit.calculateInteresr();
        System.out.println(credit.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());
    }
}
