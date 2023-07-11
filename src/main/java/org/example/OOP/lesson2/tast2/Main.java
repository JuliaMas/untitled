package org.example.OOP.lesson2.tast2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        human.drive(car);
        human.stop(car);
        human.drive(car);
        human.stop(car);
    }
}
