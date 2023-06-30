package org.example.lesson5.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("\\p{Punct}", "");
        String findWord = "РоСсия";
        String[] arrayText = text.split(" ");
        System.out.println(text);
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText) {
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())) {
                continue;
            }
            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println( findWord + " - " + map.getOrDefault(findWord.toLowerCase(), 0));
    }
}

//Подсчитать количество искомого слова, через map (наполнением значение,
// где искомое слово будет являться ключом), вносить все слова не нужно

