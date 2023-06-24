package org.example.lesson3.HomeWork.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    public String name;
    public String country;
    public Integer weight;
    public Integer price;
    public String grade;

}
