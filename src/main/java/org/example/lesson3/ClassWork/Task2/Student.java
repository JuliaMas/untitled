package org.example.lesson3.ClassWork.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer groupNumber;
    private Integer salary;
    private List<Integer> scores;
}
