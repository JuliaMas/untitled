package org.example.OOP.lesson1_1.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Basket extends Store {
    public Basket(List<Product> product){
        super.setCatalog(product);
    }
    public Basket(){
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "Basket{}";
    }
}
