package org.example.OOP.lesson3.game;

import java.util.List;

public interface Game {
    void start(int lengthWord, int countTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();


    List<String> getLogo();

    void restart();
}
