package org.example.OOP.lesson1_1.HomeWork;

import java.util.List;

public class User {
    private String name;
    private String password;
    private Basket basket;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.basket = new Basket();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getBasket() {
        return basket.getCatalog();
    }

    public void buy(Product product, Store store){
        basket.addProduct(product);
        store.deleteProduct(product);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
