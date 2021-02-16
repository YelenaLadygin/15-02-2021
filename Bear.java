package com.creatures;

import lombok.Getter;

public class Bear extends Animal {
    private @Getter String m_bear;

    public void bear_likes_honey(){
        System.out.println("Bear likes honey");
    }
    public Bear (String name){
        super("misha");
    }
}
