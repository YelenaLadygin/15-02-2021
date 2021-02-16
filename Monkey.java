package com.creatures;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Monkey extends Animal {
    private @Getter String m_monkey;

    public void climb_on_tree(){
        System.out.println("Monkey can climb on tree");
    }
     public Monkey (String name){
        super("Chita");
     }
    }
