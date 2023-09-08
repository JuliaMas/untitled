package org.example.toy.controller;

import org.example.toy.modul.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller implements Icontroler {
    List<String> result;
    List<Toy> toyList;
    int count;
    List<String> toyQueue;

    public Controller(List<Toy> toyList) {
        if (toyList.size() < 3) {
            throw new RuntimeException("Необходимо минимум 3 игрушки!");
        }
        this.toyQueue = new ArrayList<>();
        this.result = new ArrayList<>();
        this.toyList = toyList;
        this.createQueue();
    }

    /**
     * Этот метод создает список игрушек с количеством шанса выпадения
     */
    private void createQueue() {
        for (int i = 0; i < this.toyList.size(); i++) {
            Toy toy = this.toyList.get(i);
            int tmp = toy.getCount();
            for (int j = 0; j < this.toyList.get(i).getWeight(); j++) {
                if (tmp == 0) {
                    this.toyList.remove(toy);
                    i--;
                    break;
                }
                this.result.add(toy.toString());
                toy.setCount(--tmp);
            }
        }
        this.count = result.size();
    }

    /**
     * Метод для рандомной выдачи игрушки из списка
     *
     * @return
     */
    @Override
    public String get() {
        Random random = new Random();
        if (this.count == 0) {
            this.createQueue();
            if (this.count == 0) {
                throw new RuntimeException("Игрушки закончились!");
            }
        }
        int n = random.nextInt(0, this.count);
        String tmp = this.result.get(n);
        int tmp2 = this.checkCount(tmp, n);
        String toy = this.result.get(tmp2);
        this.result.remove(toy);
        this.count--;
        this.toyQueue.add(toy);
        return toy;
    }

    private int checkCount(String str, int n) {
        int res = n;
        for (int i = 0; i < this.result.size(); i++) {
            int indStr = str.length() - 1;
            int indStrList = this.result.get(i).length() - 1;
            if (str.charAt(0) == this.result.get(i).charAt(0)) {
                if (Integer.parseInt(Character.toString(str.charAt(indStr))) <
                        Integer.parseInt(Character.toString(this.result.get(i).charAt(indStrList)))) {
                    res = i;
                    str = this.result.get(i);
                }
            }
        }
        return res;
    }

    /**
     * Местод необходим для сохранения в файл
     *
     * @return очередь
     */
    @Override
    public List<String> getToyQueue() {
        return this.toyQueue;
    }
}

