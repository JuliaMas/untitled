package org.example.OOP.lesson6.homeWork;

import org.example.OOP.lesson6.homeWork.data.PhoneBook;
import org.example.OOP.lesson6.homeWork.data.User;
import org.example.OOP.lesson6.homeWork.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        for (int i = 0; i < 5; i++) {
            phoneBook1.setUser(new User("Женя", 1000 +i));
        }
        PhoneBook phoneBook2 = new PhoneBook();
        for (int i = 0; i < 3; i++) {
            phoneBook2.setUser(new User("Катя", 1000 +i));
        }
        PhoneBook phoneBook3 = new PhoneBook();
        for (int i = 0; i < 2; i++) {
            phoneBook3.setUser(new User("Аня", 1000 +i));
        }
        List<PhoneBook> bookList = new ArrayList<>(Arrays.asList(phoneBook1,phoneBook2, phoneBook3));
        View view = new View(bookList);
        view.start();
    }
}
