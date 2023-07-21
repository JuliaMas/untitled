package org.example.OOP.lesson3.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnGame extends AbstractGame {

    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }

    @Override
    public String getNameGame() {
        List<String> temp = Arrays.asList(getClass().getName().split("\\."));
        return temp.get(temp.size() - 1);
    }
}
