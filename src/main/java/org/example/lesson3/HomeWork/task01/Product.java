package org.example.lesson3.HomeWork.task01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    public String name;
    public Integer price;
    public String grade;
}
