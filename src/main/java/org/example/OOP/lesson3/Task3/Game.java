package org.example.OOP.lesson3.Task3;

import java.util.List;

//Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus
public interface Game {
     void start(int lengthWord, int countTry);
     Answer inputValue(String value);
     GameStatus getGameStatus();


    List<String> getLogo();

    void restart();
}
