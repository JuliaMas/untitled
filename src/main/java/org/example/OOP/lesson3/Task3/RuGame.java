package org.example.OOP.lesson3.Task3;

import java.util.ArrayList;
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
}
