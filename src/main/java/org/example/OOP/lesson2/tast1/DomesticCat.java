package org.example.OOP.lesson2.tast1;

public class DomesticCat extends Cat{
    static int count;

    public DomesticCat(String name, int runDistunce) {
        super(name, runDistunce);
        count++;
    }
}
