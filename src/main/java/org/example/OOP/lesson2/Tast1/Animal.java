package org.example.OOP.lesson2.Tast1;

public abstract class Animal {
    static Integer count;
    String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }
    public abstract void run(int distunce);
    public abstract void swim(int distance);
}
