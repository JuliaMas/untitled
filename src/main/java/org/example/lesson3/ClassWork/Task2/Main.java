package org.example.lesson3.ClassWork.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов", 23, 1000, List.of(3, 4, 4));
        Student student2 = new Student("Петрова", 23, 1000, List.of(6, 1, 4));
        Student student3 = new Student("Сидорова", 23, 1000, List.of(5, 2, 4));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            //int sum = sumScores(student.getScores());
            //if (student.getName().endsWith("ова") && sum % 2 == 0) {
                System.out.println(student.getSalary());


            }
        }


    }
