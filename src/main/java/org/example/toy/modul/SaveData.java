package org.example.toy.modul;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import static java.nio.file.StandardOpenOption.APPEND;

public class SaveData {
    public String saveData(List<String> queue) throws NewFolder {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String path = "D:\\Обучение\\Java\\untitled\\src\\main\\java\\org" +
                "\\example\\toy\\data" + dateFormat.format(date) + ".txt";
        if (!checkFile(path)) {
            File f = new File(path);
            try {
                f.createNewFile();
            } catch (IOException e) {
                new File("D:\\Обучение\\Java\\untitled\\src\\main\\java" +
                        "\\org\\example\\toy\\data").mkdirs();
                throw new NewFolder();
            }
            if (f.exists()) {
                try {
                    for (String toy : queue) {
                        String str = toy + "\n";
                        Files.write(Paths.get(path), str.getBytes(), APPEND);
                    }
                    String str1 = "-------------------------------------------------------------------" + "\n";
                    Files.write(Paths.get(path), str1.getBytes(), APPEND);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            try {
                for (String toy : queue) {
                    String str = toy + "\n";
                    Files.write(Paths.get(path), str.getBytes(), APPEND);
                }
                String str1 = "-------------------------------------------------------------------" + "\n";
                Files.write(Paths.get(path), str1.getBytes(), APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return "Данные сохранены!";
    }

    private boolean checkFile(String nameFile) {
        File f = new File(nameFile);
        if (f.exists()) {
            return true;
        }
        return false;
    }
}
