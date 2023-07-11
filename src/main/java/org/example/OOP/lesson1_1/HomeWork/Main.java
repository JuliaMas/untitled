package org.example.OOP.lesson1_1.HomeWork;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store topshop = new Store("TopShop");
        Product rings1 = new Product("Flower", 12000, 9.6);
        Product rings2 = new Product("Fire", 4300, 8.1);
        Product rings3 = new Product("Herb", 2540, 3.4);
        Product earrings1 = new Product("Flower1", 16000, 9.8);
        Product earrings2 = new Product("Fire1", 8400, 4.3);
        Product earrings3 = new Product("Herb1", 5000, 5.0);
        Product pendant1 = new Product("Flower3", 7000, 9.5);
        Product pendant2 = new Product("Fire3", 3500, 7.9);
        Product pendant3 = new Product("Herb3", 2000, 4.4);
        topshop.addProduct(rings1);
        topshop.addProduct(rings2);
        topshop.addProduct(rings3);
        topshop.addProduct(earrings1);
        topshop.addProduct(earrings2);
        topshop.addProduct(earrings3);
        topshop.addProduct(pendant1);
        topshop.addProduct(pendant2);
        topshop.addProduct(pendant3);
        Category rings = new Category("Rings");
        rings.addProduct(rings1);
        rings.addProduct(rings2);
        rings.addProduct(rings3);
        Category earrings = new Category("Earrings");
        earrings.addProduct(earrings1);
        earrings.addProduct(earrings2);
        earrings.addProduct(earrings3);
        Category pendant = new Category("Pendant");
        pendant.addProduct(pendant1);
        pendant.addProduct(pendant2);
        pendant.addProduct(pendant3);
        User user1 = new User("AAA", "qwe");
        User user2 = new User("ZZZ", "asd");
        User user3 = new User("QQQ", "ZXC");
        List<Product> products = topshop.getCatalog();
        System.out.println(products);
        user2.buy(rings2, topshop);
        List<Product> user2Basket = user2.getBasket();
        System.out.println("user2Basket = " + user2Basket);
        user1.buy(earrings3, topshop);
        List<Product> user1Basket = user1.getBasket();
        System.out.println("user1Basket = " + user1Basket);
        user3.buy(pendant2, topshop);
        List<Product> user3Basket = user3.getBasket();
        System.out.println("user3Basket = " + user3Basket);
        products = topshop.getCatalog();
        System.out.println(products);
    }
}
