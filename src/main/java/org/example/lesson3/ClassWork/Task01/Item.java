package org.example.lesson3.ClassWork.Task01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    public String name;
    public String country;
    public Integer volume;
}
