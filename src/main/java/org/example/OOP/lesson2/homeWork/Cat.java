package org.example.OOP.lesson2.homeWork;

public class Cat implements Action {
    static int distance;
    static int height;
    static int flag;
    static String name;

    public Cat(String name) {
        this.name = name;
        distance = 90;
        height = 3;
        flag = 0;
    }

    @Override
    public void run(Racetrack racetrack) {
        if (distance > racetrack.distance) {
            System.out.println(getName() + " Пробежал");
        } else {
            flag++;
            System.out.println(getName() + " не добежал!");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (height > wall.height) {
            System.out.println(getName() + " перепрыгнул!");
        } else {
            flag++;
            System.out.println(getName() + "не перепрыгнул!");
        }
    }

    @Override
    public int getFlag() {
        return flag;
    }

    @Override
    public String getName() {
        return name;
    }
}
