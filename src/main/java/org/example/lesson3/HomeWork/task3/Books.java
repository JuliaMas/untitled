package org.example.lesson3.HomeWork.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    public String name;
    public String author;
    public Integer year;
    public Integer price;
    public Integer volume;
}
