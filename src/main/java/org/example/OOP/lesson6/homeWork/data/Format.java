package org.example.OOP.lesson6.homeWork.data;

import org.example.OOP.lesson6.homeWork.dataset.Formater;

public class Format implements Formater {

    @Override
    public PhoneBook formatPdf(PhoneBook phoneBook) {
        System.out.println("Формат PDF");
        return phoneBook;
    }

    @Override
    public PhoneBook formatJson(PhoneBook phoneBook) {
        System.out.println("Формат JSON");
        return phoneBook;
    }
}
