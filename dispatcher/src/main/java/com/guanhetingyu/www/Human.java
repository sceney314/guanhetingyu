package com.guanhetingyu.www;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Date: 2020-07-29 19:03
 * Copyright (C), 2015-2020
 */
public abstract class Human {
    @Autowired
    private People people;

    public void getName(){
        people.printName();
    }
}
