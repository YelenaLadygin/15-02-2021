package com.creatures;

import lombok.Getter;

public class Tiger extends Animal {
    private @Getter String m_tiger;

    public void tiger_is_dangerous(){
        System.out.println(" Tiger is a dangerous animal");
    }
    public Tiger (String name){
        super("Tiger");
    }
}
