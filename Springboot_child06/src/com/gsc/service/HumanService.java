package com.gsc.service;

import com.gsc.interfaces.IHuman;
import com.gsc.interfaces.impl.Human;

public class HumanService {
    public static void main(String[] args) {
        Human h = new Human("abc");
        h.jump();
        h.say();
        h.work();
    }
}
