package org.example.OOP.lesson6.homeWork.data;

import org.example.OOP.lesson6.homeWork.dataset.ActionPhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements ActionPhoneBook {
    private List<User> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public List<User> getPhoneBook() {
        return phoneBook;
    }

    public void setUser(User user) {
        phoneBook.add(user);
    }

    public User getUser(int id) {
        return phoneBook.get(id);
    }

    @Override
    public void importPhoneBook(List<User> phoneBook) {
        for (int i = 0; i < phoneBook.size(); i++) {
            this.phoneBook.add(phoneBook.get(i));
        }
    }



    @Override
    public void exportPhoneBook(PhoneBook phoneBook) {
        for (int i = 0; i < this.phoneBook.size(); i++) {
            phoneBook.setUser(this.phoneBook.get(i));
        }
    }

    @Override
    public String toString() {
        String res = "[";
        for (int i = 0; i < this.phoneBook.size(); i++) {
            if (i == this.phoneBook.size() - 1) {
                res += this.phoneBook.get(i).toString() + "]";
            } else {
                res += this.phoneBook.get(i).toString() + ",";
            }
        }
        return res;
    }
}
