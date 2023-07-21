package org.example.OOP.lesson3.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGame extends AbstractGame {

    @Override
    public List<String> generateCharList() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(Integer.toString(i));
        }
        return stringList;
    }

    @Override
    public String getNameGame() {
        List<String> tempt = Arrays.asList(getClass().getName().split("\\."));
        return tempt.get(tempt.size() - 1);
    }
}
