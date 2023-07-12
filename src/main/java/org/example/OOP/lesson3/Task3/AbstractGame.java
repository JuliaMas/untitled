package org.example.OOP.lesson3.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected int wordLength;
    protected int tryCount;
    protected String word;
    protected GameStatus status = GameStatus.INIT;
    protected List<String> logo = new ArrayList<>();
    protected int attempt;

    public AbstractGame(int wordLength, int tryCount, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
        this.logo = new ArrayList<>();
        this.attempt = 0;
    }

    public AbstractGame() {
    }

    @Override
    public void start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.wordLength = lengthWord;
        this.tryCount = countTry;
        this.word = generateWord();
        this.logo.add(String.format("Запуск игры %s; Число попыток: %d; Загаданное значение: %s",
                getNameGame(), countTry, this.word));
        System.out.println("word = " + word);
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
        return sb.toString();
    }

    public abstract List<String> generateCharList();

    public abstract String getNameGame();

    @Override
    public Answer inputValue(String input) {
        attempt++;
        if (--tryCount == 0) {
            int bulls = 0;
            int cows = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == word.charAt(i)) {
                    bulls++;
                }
                if (word.contains(String.valueOf(input.charAt(i)))) {
                    cows++;
                }
            }
            logo.add(String.format("Попытка номер %d ; введенный вариант - %s; "
                    + "быки - %d, коровы - %d", attempt, bulls, cows));
            if (bulls == wordLength) {
                logo.add(String.format("Победа с %d  попытки, быки - %d, коровы - %d", attempt, bulls, cows));
                status = GameStatus.WIN;
            } else {
                logo.add("Поражение!");
                status = GameStatus.FINISH;
            }
            return new Answer(bulls, cows);
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
        return status;
    }

    @Override
    public List<String> getLogo() {
        return logo;
    }

    @Override
    public void restart() {
        this.logo = new ArrayList<>();
        this.attempt = 0;
    }
}


















