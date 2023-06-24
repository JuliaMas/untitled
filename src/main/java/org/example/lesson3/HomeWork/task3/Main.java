package org.example.lesson3.HomeWork.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books("Книга1", "Иванов", 2011, 100, 112));
        booksList.add(new Books("Книга2", "Кохх", 2018, 100, 100));
        booksList.add(new Books("Книга3", "Астапов", 2009, 100, 193));
        booksList.add(new Books("Книга4", "Мартынов", 2015, 100, 107));
        booksList.add(new Books("Книга5", "Зауэр", 2017, 100, 113));
        List<String> founbook = new ArrayList<>();
        for (Books books : booksList) {
            isSimple(books.getVolume());
            if (isSimple(books.volume) && books.getYear() >= 2010 && books.getAuthor().contains("а")) {
                founbook.add(books.getAuthor());
            }
        }
        System.out.println(founbook);
    }

    /**
     * @param volume количество страниц
     * @return простое или нет
     * @apiNote проверяет является ли количество страниц простым числом
     */
    private static boolean isSimple(Integer volume) {
        if (volume < 2) {
            return false;
        }
        for (int i = 2; i < volume / 2; i++) {
            if (volume % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
// и год издания после 2010 г, включительно.