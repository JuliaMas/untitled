package org.example.OOP.lesson3.Task3;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected int wordLength;
    protected int tryCount;
    protected String word;
    protected GameStatus status;

    public AbstractGame(int wordLength, int trycount, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.tryCount = trycount;
        this.word = word;
        this.status = status;
    }

    public AbstractGame() {
    }

    @Override
    public void start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.wordLength = lengthWord;
        this.tryCount = countTry;
        word = generateWord();


    }

    private String generateWord() {
        List<String> strList = generateCharList();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            int idx = random.nextInt(strList.size());
            sb.append(strList.get(idx));
            strList.remove(idx);
        }
        return null;
    }

    public abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String input) {

        if (tryCount-- == 0) {
            status = GameStatus.FINISH;
        }
        if (status == GameStatus.FINISH) {
            throw new RuntimeException("game over!");
        }
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word.charAt(i)) bulls++;
            if (word.contains(String.valueOf(input.charAt(i)))) cows++;
        }
        return new Answer(bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return null;
    }
}


















