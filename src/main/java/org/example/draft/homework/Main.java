package org.example.draft.homework;

import org.example.draft.homework.obstruction.Obstruction;
import org.example.draft.homework.obstruction.Racetrack;
import org.example.draft.homework.obstruction.Wall;
import org.example.draft.homework.person.Cat;
import org.example.draft.homework.person.Human;
import org.example.draft.homework.person.Robot;

public class Main {
    public static void main(String[] args) {
        Object[] competitors = {
                new Human("Ivan", 20, 300),
                new Human("Vlad", 10, 200),
                new Cat("Barsik", 40, 400),
                new Cat("Pyshok", 35, 410),
                new Robot("AA-12", 17, 210),
                new Robot("AA-13", 21, 220)};
        Obstruction[] obstructions = {
                new Racetrack("Race 1", 100),
                new Wall("Wall 1", 10),
                new Wall("Wall 2", 20),
                new Racetrack("Race 2", 100),
                new Wall("Wall 3", 45)};
        for (Object competitor : competitors) {
            for (Obstruction obstruction : obstructions) {
                System.out.println(obstruction.getName() + " - ");
                if (competitor instanceof Human) {
                    if (obstruction instanceof Racetrack) {
                        if (!((Human) competitor).run((Racetrack) obstruction)) break;
                    } else {
                        if (!((Human) competitor).jump((Wall) obstruction)) break;
                    }
                } else if (competitor instanceof Cat) {
                    if (obstruction instanceof Racetrack) {
                        if (!((Cat) competitor).run((Racetrack) obstruction)) break;
                    } else {
                        if (!((Cat) competitor).jump((Wall) obstruction)) break;
                    }

                } else if (competitor instanceof Robot) {
                    if (obstruction instanceof Racetrack) {
                        if (!((Robot) competitor).run((Racetrack) obstruction)) break;
                    } else {
                        if (!((Robot) competitor).jump((Wall) obstruction)) break;
                    }
                }
            }
            System.out.println(" участник выбывает из гонки!!! \n");
        }
    }
}
