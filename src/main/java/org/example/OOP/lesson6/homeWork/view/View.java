package org.example.OOP.lesson6.homeWork.view;

import org.example.OOP.lesson6.homeWork.data.Format;
import org.example.OOP.lesson6.homeWork.data.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    List<PhoneBook> phoneBookList;

    public View(List<PhoneBook> phoneBookList) {
        this.phoneBookList = new ArrayList<>();
        this.phoneBookList.addAll(phoneBookList);
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            int n = menu();
            if (n != 99) {
                PhoneBook listPhone = this.phoneBookList.get(n);
                System.out.println(listPhone.toString());
                boolean flag2 = true;
                while (flag2) {
                    int n2 = menu2();
                    if (n2 != 99) {
                        Format format = new Format();
                        switch (n2) {
                            case (1):
                                this.phoneBookList.remove(n);
                                int temp = menu();
                                if (temp != 99) {
                                    listPhone.importPhoneBook(this.phoneBookList.get(temp).getPhoneBook());
                                    this.phoneBookList.remove(temp);
                                    this.phoneBookList.add(listPhone);
                                    break;
                                } else {
                                    this.phoneBookList.add(listPhone);
                                    break;
                                }
                            case (2):
                                this.phoneBookList.remove(n);
                                int temp1 = menu();
                                if (temp1 != 99) {
                                    listPhone.exportPhoneBook(this.phoneBookList.get(temp1));
                                    this.phoneBookList.remove(temp1);
                                    this.phoneBookList.add(listPhone);
                                    break;
                                } else {
                                    this.phoneBookList.add(listPhone);
                                    break;
                                }
                            case (3):
                                int temp2 = menuFormat();
                                if (temp2 != 99) {
                                    switch (temp2) {
                                        case (1) -> format.formatPdf(listPhone);
                                        case (2) -> format.formatJson(listPhone);
                                    }
                                } else break;
                            case (4):
                                flag2 = false;
                                break;
                        }
                    }
                }
            } else {
                flag = false;
                System.out.println("Выход");
            }
        }
    }

    private int menuFormat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: ");
        System.out.println("1. Форматировать в PDF");
        System.out.println("2. Форматировать в Json");
        System.out.println("Выход");
        int n = scanner.nextInt();
        if (n >= 3 || n < 0) {
            return 99;
        }
        return n;
    }

    private int menu2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: ");
        System.out.println("1. Импортировать телефонную книгу: ");
        System.out.println("2. Экспортировать телефонную книгу: ");
        System.out.println("3. Форматировать телефонную книгу: ");
        System.out.println("4. Выход");
        int n = scanner.nextInt();
        if (n >= 4 || n < 0) {
            return 99;
        }
        return n;
    }

    private int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите телефонную книгу(для выхода нажмите 99): ");
        for (int i = 0; i < this.phoneBookList.size(); i++) {
            System.out.println(i + "Телефонная книга");
        }
        int n1 = scanner.nextInt();
        if (n1 >= this.phoneBookList.size() || n1 < 0) {
            return 99;
        }
        return n1;
    }

}
