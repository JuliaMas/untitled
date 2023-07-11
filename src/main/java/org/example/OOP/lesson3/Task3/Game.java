package org.example.OOP.lesson3.Task3;
//Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus
public interface Game {
    public void start(int lengthWord, int countTry);
    public Answer inputValue(String value);
    public GameStatus getGameStatus();


}
