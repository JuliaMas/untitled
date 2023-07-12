package org.example.OOP.lesson3.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuGame extends AbstractGame {

    @Override
    public List<String> generateCharList() {
        List<String> stringList = new ArrayList<>();
        for (int i = 'а'; i < 'я'; i++) {
            stringList.add(Character.toString(i));
        }
        return stringList;
    }

    @Override
    public String getNameGame() {
        List<String> tmp = Arrays.asList(getClass().getName().split("\\."));
        return tmp.get(tmp.size() - 1);
    }
}
