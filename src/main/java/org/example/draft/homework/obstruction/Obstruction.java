package org.example.draft.homework.obstruction;

public abstract class Obstruction {
    protected String name;


    public Obstruction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
