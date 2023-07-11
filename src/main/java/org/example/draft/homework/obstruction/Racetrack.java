package org.example.draft.homework.obstruction;

public class Racetrack extends Obstruction {
    private final int distance;

    public Racetrack(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Racetrack{" +
                "distance=" + distance +
                '}';
    }
}
