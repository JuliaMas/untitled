package org.example.lesson5.HomeWork;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notebook {

    public String name;
    public Double screen;
    public String color;
    public String OS; //operating System
    public Integer RAM; //random access memory

}
