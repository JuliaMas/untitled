package org.example.OOP.lesson7.calculator.data;

import org.example.OOP.lesson7.calculator.dataservis.Logging;

import java.util.ArrayList;
import java.util.List;

public class Logo implements Logging {
    private List<String> logo;

    public Logo() {

        this.logo = new ArrayList<>();
    }

    @Override
    public void log() {
        for (String s : this.logo) {
            System.out.println(s);
        }
    }

    @Override
    public void saveLog(String str) {

        this.logo.add(str);
    }
}



