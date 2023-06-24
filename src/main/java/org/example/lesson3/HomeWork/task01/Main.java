package org.example.lesson3.HomeWork.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("средний", 200, "первый"));
        products.add(new Product("высший", 800, "первый"));
        products.add(new Product("высший", 870, "второй"));
        products.add(new Product("средний", 200, "первый"));
        products.add(new Product("высший", 900, "третий"));
        int maxPrice = 0;
        for (Product product : products) {
            if((product.getGrade().equals("первый") || product.getGrade().equals("второй"))
                    && product.getName().contains("высший")){
                if (product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                }
            }
        }
        System.out.println("Наибольшая цена товара " + maxPrice);
    }
}
//Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».


