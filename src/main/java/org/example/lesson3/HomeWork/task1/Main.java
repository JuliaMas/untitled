package org.example.lesson3.HomeWork.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("средний", 200, "первый");
        Item item2 = new Item("высший", 300, "второй");
        Item item3 = new Item("средний", 150, "первый");
        Item item4 = new Item("высший", 200, "первый");
        Item item5 = new Item("высший", 200, "третий");
        List<Item> product = new ArrayList<>();
        product.add(item1);
        product.add(item2);
        product.add(item3);
        product.add(item4);
        product.add(item5);
        System.out.println(product);



        }
        }




//Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».


