package org.example.OOP.lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        Fructs fructs = Fructs.valueOf("BANAN");
        System.out.println("fructs = " + fructs);
        switch (fructs){
            case APLE, BANAN, ORANGE -> System.out.println("Это фрукт "+ fructs.name);
            default -> System.out.println("Неопознанный фрукт");
        }
//        for (Fructs value : Fructs.values()) {
//            System.out.println(value);
//
//        }
    }
}
