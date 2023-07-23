package org.example.OOP.lesson6.homeWork.dataset;

import org.example.OOP.lesson6.homeWork.data.PhoneBook;
import org.example.OOP.lesson6.homeWork.data.User;

import java.util.List;

public interface ActionPhoneBook {
    void importPhoneBook(List<User> phoneBook);
    void exportPhoneBook(PhoneBook phoneBook);
}
