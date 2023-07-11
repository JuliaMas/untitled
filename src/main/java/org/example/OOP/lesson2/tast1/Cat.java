package org.example.OOP.lesson2.tast1;

public class Cat extends Animal {
    static int count;
    int runDistunce;



    public Cat(String name, int runDistunce) {
        super(name);
        if (runDistunce > 500) {
            this.runDistunce = 500;
            System.out.println("введенное значение больше максимального");
        } else {
            this.runDistunce = runDistunce;
        }

        this.runDistunce = runDistunce;

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
        System.out.println(super.name+ "не умеет плавать");

    }
}
