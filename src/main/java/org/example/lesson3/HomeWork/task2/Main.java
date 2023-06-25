package org.example.lesson3.HomeWork.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Товар1", "qwe", 200, 300, "первый"));
        products.add(new Product("Товар2", "asd", 200, 234, "первый"));
        products.add(new Product("Товар3", "zxd", 200, 432, "второй"));
        products.add(new Product("Товар4", "qwe", 200, 123, "первый"));
        products.add(new Product("Товар5", "asd", 200, 765, "второй"));
        products.add(new Product("Товар6", "dfg", 200, 134, "второй"));
        Scanner scanner = new Scanner(System.in);
        String searchGrade = scanner.nextLine();
        int minPrice = Integer.MAX_VALUE;
        List<String> nameMin = new ArrayList<>();
        for (Product product : products) {
            if (product.getGrade().equals(searchGrade)) {
                if (product.getPrice() < minPrice) {
                    minPrice = product.getPrice();
                    nameMin.clear();
                    nameMin.add(product.getName());
                } else if (product.getPrice() == minPrice) {
                    nameMin.add(product.getName());
                }
            }
        }
        System.out.println("Наименование товара с наименьшей ценой " + nameMin);
    }
}



//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.