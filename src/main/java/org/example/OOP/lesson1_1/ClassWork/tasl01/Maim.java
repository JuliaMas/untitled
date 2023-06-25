package org.example.OOP.lesson1_1.ClassWork.tasl01;

import java.sql.SQLOutput;
import java.util.ArrayList;

//Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
public class Maim {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik","white", 21 );
        /*cat1.name ="barsik";
        cat1.color ="white";
        cat1.age =21;*/
        System.out.println("Кот: " + cat1.getName() + ", " + cat1.getColor()
                + " цвета , имеет возраст: " + cat1.getAge() + " лет");

        Cat cat2 = new Cat("Murzuk", "black",3);
        /*cat2.name ="Murzuk";
        cat2.color ="black";
        cat2.age =3;*/
        cat2.setName("tihon");
        cat2.setAge(-10);
        System.out.println("Кот: " + cat2.getName() + ", "
                + cat2.getColor() + " цвета , имеет возраст: " + cat2.getAge() + " лет");
        cat1.animalInfo();
        cat2.jump();
        cat1.voice();
        Dog dog = new Dog("qwe");
        dog.voice();

    }

}
