package org.example.OOP.lesson2.Tast1;

public class Dog extends Animal {
    static int count;
    int runDistunce;
    int swimDistunce;

    public Dog(String name, int runDistunce, int swimDistunce) {
        super(name);
        if (runDistunce > 500) {
            this.runDistunce = 500;
            System.out.println("введенное значение больше максимального");
        } else {
            this.runDistunce = runDistunce;
        }
        if (swimDistunce > 10) {
            this.swimDistunce = 10;
            System.out.println("введенное значение больше максимального");
        } else {
            this.swimDistunce = swimDistunce;
        }
        this.runDistunce = runDistunce;
        this.swimDistunce = swimDistunce;
        count++;
    }

    @Override
    public void run(int distunce) {
        if (distunce > runDistunce) {
            System.out.println(super.name + "не пробежит");
        } else {
            System.out.println(super.name + "пробежал");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > swimDistunce) {
            System.out.println(super.name + "не проплыл");
        } else {
            System.out.println(super.name + "проплыл");
        }

    }
}
