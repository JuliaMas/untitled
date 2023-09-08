package org.example.exceptions.homeWork_3.controller;

import org.example.exceptions.homeWork_3.moduls.NoFolder;
import org.example.exceptions.homeWork_3.moduls.User;

public interface SaveUserInt {
    String saveUser(User user) throws NoFolder;
}
