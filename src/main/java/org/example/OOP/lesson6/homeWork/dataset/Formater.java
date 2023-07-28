package org.example.OOP.lesson6.homeWork.dataset;

import org.example.OOP.lesson6.homeWork.data.PhoneBook;

public interface Formater {
    PhoneBook formatPdf(PhoneBook phoneBook);
    PhoneBook formatJson(PhoneBook phoneBook);

}
