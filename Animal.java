package com.creatures;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Animal {
    private @Getter String name_of_animal;

    public Animal(String name_of_animal) {
        this.name_of_animal = name_of_animal;
    }
}