package org.example.OOP.lesson2.Tast1;

public class Tiger extends Cat{
    static int count;

    public Tiger(String name, int runDistunce) {
        super(name, runDistunce);
        count++;
    }
}
