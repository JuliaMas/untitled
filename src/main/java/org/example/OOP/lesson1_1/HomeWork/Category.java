package org.example.OOP.lesson1_1.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Category extends Store {

    public Category(String name) {
        super(name);
        super.setCatalog(new LinkedList<>());
    }


}
