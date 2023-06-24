package org.example.lesson3.HomeWork.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    public String name;
    public Integer price;
    public String grade;
}
