package org.example.lesson5.HomeWork;

import java.util.LinkedList;
import java.util.List;


public class Selection {
    /**
     * @param notebooks все ноутбуки
     * @param value     условие отбора
     * @return список ноутбуков, отвечающий условию
     * @apiNote выбор по названию ноутбука
     */
    public static List<Notebook> selectionName(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.name.equals(value)) {
                result.add(notebook);
            }
        }
        return result;
    }

    /**
     * @param notebooks все ноутбуки
     * @param value     условие отбора
     * @return список ноутбуков, отвечающий условию
     * @apiNote отбор по диагонали экрана
     */
    public static List<Notebook> selectionScreen(List<Notebook> notebooks, String value) {
        double screen = Double.parseDouble(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.screen <= screen) {
                result.add(notebook);
            }
        }
        return result;
    }

    /**
     * @param notebooks все ноутбуки
     * @param value     условие отбора
     * @return список ноутбуков, отвечающий условию
     * @apiNote отбор по цвету
     */
    public static List<Notebook> selectionColor(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.color.equals(value)) {
                result.add(notebook);
            }
        }
        return result;
    }

    /**
     * @param notebooks все ноутбуки
     * @param value     условие отбора
     * @return список ноутбуков, отвечающий условию
     * @apiNote отбор по операционной системе
     */
    public static List<Notebook> selectionOS(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.OS.equals(value)) {
                result.add(notebook);
            }
        }
        return result;
    }

    /**
     * @param notebooks все ноутбуки
     * @param value     условие отбора
     * @return список ноутбуков, отвечающий условию
     * @apiNote отбор по объему оперативной памяти
     */
    public static List<Notebook> selectionRAM(List<Notebook> notebooks, String value) {
        Integer ram = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.RAM <= ram) {
                result.add(notebook);
            }
        }
        return result;
    }
}
