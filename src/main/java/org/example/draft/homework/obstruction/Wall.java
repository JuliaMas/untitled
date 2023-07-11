package org.example.draft.homework.obstruction;

public class Wall extends Obstruction {
    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }
}
