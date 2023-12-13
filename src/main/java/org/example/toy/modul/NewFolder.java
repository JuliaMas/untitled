package org.example.toy.modul;

import java.io.IOException;

public class NewFolder extends IOException {
    public NewFolder() {
        super("Появилась папка 'data', повторите операцию.");
    }
}
