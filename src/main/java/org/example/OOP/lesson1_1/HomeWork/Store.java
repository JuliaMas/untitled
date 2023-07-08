package org.example.OOP.lesson1_1.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Store {
    private String name;
    private List<Product> catalog;

    public Store(String name, List<Product> catalog) {
        this.name = name;
        this.catalog = catalog;
    }
    public Store(String name){
        this.name = name;
        this.catalog = new LinkedList<>();
    }
    public Store(){

    }
    public String getName(){
        return name;
    }
    public List<Product> getCatalog(){
        return catalog;
    }
    public void setCatalog(List<Product> catalog){
        this.catalog = catalog;
    }
    public void addProduct(Product product){
        this.catalog.add(product);
    }
    public void deleteProduct(Product product){
        this.catalog.remove(product);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", catalog=" + catalog +
                '}';
    }
}
