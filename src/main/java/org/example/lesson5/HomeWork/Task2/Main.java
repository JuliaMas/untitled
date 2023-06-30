package org.example.lesson5.HomeWork.Task2;

import java.util.*;
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности
public class Main {
    public static void main(String[] args) {
        List<People> listEmployees = employees();
        Map<String, Integer> result = nameCount(listEmployees);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        finalList(list);

    }

    private static void finalList(List<Map.Entry<String, Integer>> list) {
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Имя " + entry.getKey() + " встречается  " + entry.getValue() + " раз(a)");
        }
    }

    private static Map<String, Integer> nameCount(List<People> listEmployees) {
        Map<String, Integer> result = new HashMap<>();
        for (People employee : listEmployees) {
            result.putIfAbsent(employee.getName(), 0);
            result.put(employee.getName(), result.get(employee.getName()) + 1);
        }
        return result;
    }

    private static List<People> employees() {
        List<People> listEmployees = new LinkedList<>();
        listEmployees.add(new People("Иван", "Иванов"));
        listEmployees.add(new People("Светлана", "Петрова"));
        listEmployees.add(new People("Кристина", "Белова"));
        listEmployees.add(new People("Анна", "Мусина"));
        listEmployees.add(new People("Анна", "Крутова"));
        listEmployees.add(new People("Иван", "Юрин"));
        listEmployees.add(new People("Петр", "Лыков"));
        listEmployees.add(new People("Павел", "Чернов"));
        listEmployees.add(new People("Петр", "Чернышов"));
        listEmployees.add(new People("Мария", "Федорова"));
        listEmployees.add(new People("Марина", "Светлова"));
        listEmployees.add(new People("Мария", "Савина"));
        listEmployees.add(new People("Мария", "Рыкова"));
        listEmployees.add(new People("Марина", "Лугова"));
        listEmployees.add(new People("Анна", "Владимирова"));
        listEmployees.add(new People("Иван", "Мечников"));
        listEmployees.add(new People("Петр", "Петин"));
        listEmployees.add(new People("Иван", "Ежов"));
        return listEmployees;

    }
}
