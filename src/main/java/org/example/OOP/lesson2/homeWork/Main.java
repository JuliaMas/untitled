package org.example.OOP.lesson2.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Obstructions> let = new ArrayList<>();
        let.add(new Racetrack("Race 1", 40));
        let.add(new Wall("Wall 1", 1));
        let.add(new Wall("Wall 2", 2));
        let.add(new Racetrack("Race 2", 20));
        let.add(new Racetrack("Race 3", 50));
        let.add(new Wall("Wall 3", 3));
        List<Action> actionList = new ArrayList<>();
        actionList.add(new Human("man 1"));
        actionList.add(new Cat("cat 1"));
        actionList.add(new Robot("robot 1"));

        for (int i = 0; i < actionList.size(); i++) {
            for (int j = 0; j < let.size(); j++) {
                if (let.get(j) instanceof Racetrack) {
                    actionList.get(i).run((Racetrack) let.get(j));
                    if (actionList.get(i).getFlag() != 0) {
                        System.out.println("Участник " + actionList.get(i).getName() + " проиграл ");
                        actionList.remove(actionList.get(i));
                        i--;
                        break;
                    }
                } else {
                    actionList.get(i).jump((Wall) let.get(j));
                    if (actionList.get(i).getFlag() != 0) {
                        System.out.println("Участник " + actionList.get(i).getName() + " проиграл ");
                        i--;
                        break;
                    }
                }
            }
        }
        for (Action action : actionList) {
            System.out.println(action.getName() + " прошёл все препятствия!");
        }
    }
}
