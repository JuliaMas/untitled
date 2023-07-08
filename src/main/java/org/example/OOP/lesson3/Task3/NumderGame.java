package org.example.OOP.lesson3.Task3;

import java.util.ArrayList;
import java.util.List;

public class NumderGame extends AbstractGame{

    @Override
    public List<String> generateCharList(){
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(Integer.toString(i));
        }
        return stringList;
    }


}
