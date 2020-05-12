package com.gsc.interfaces.impl;

import com.gsc.interfaces.IHuman;

public class Human implements IHuman {
    private String a ;
    public Human(String a) {
        this.a = a;
    }
    @Override
    public void say() {
        System.out.println("say:" +this.a);
    }

    @Override
    public void work() {
        System.out.println("work:" + this.a);
    }

    @Override
    public void jump() {
        System.out.println("jump:" + this.a);
    }
}
