package org.example.OOP.lesson2.homeWork;

public interface Action {
    void run(Racetrack racetrack);
    void  jump (Wall wall);

    int getFlag();

    String getName();
}
