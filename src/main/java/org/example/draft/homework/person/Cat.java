package org.example.draft.homework.person;

import org.example.draft.homework.action.Jump;
import org.example.draft.homework.action.Run;
import org.example.draft.homework.obstruction.Racetrack;
import org.example.draft.homework.obstruction.Wall;

public class Cat implements Run, Jump {
    private final String name;
    private final int jumpHeight;
    private int runDist;

    public Cat(String name, int jumpHeight, int runDist) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDist = runDist;
    }

    public Cat(String name) {
        this.name = name;
        this.jumpHeight = 0;
        this.runDist = 0;
    }

    @Override
    public boolean jump(Wall wall) {
        if (jumpHeight > wall.getHeight()) {
            System.out.println(getName() + " перепрыгнул ");
            return true;
        } else {
            System.out.println(getName() + " не допрыгнул ");
        }
        return false;
    }

    @Override
    public boolean run(Racetrack racetrack) {
        if (runDist > racetrack.getDistance()) {
            runDist -= racetrack.getDistance();
            System.out.println(getName() + " пробежал ");
            return true;
        } else {
            System.out.println(getName() + " не добежал ");
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
