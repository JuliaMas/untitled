package org.example.lesson5.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class AllNB {
    public static List<Notebook> addData() {
        List<Notebook> notebook = new LinkedList<>();
        notebook.add(new Notebook("Asus", 15.6, "black", "windows", 8));
        notebook.add(new Notebook("Acer", 17.3, "silver", "linux", 16));
        notebook.add(new Notebook("Asus", 15.3, "silver", "windows", 32));
        notebook.add(new Notebook("Acer", 16.8, "white", "linux", 32));
        notebook.add(new Notebook("Acer", 15.3, "black", "windows", 8));
        notebook.add(new Notebook("Asus", 15.6, "black", "linux", 16));
        return notebook;
    }
}
