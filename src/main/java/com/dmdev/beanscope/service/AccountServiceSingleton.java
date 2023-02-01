package com.dmdev.beanscope.service;

import org.springframework.stereotype.Service;
@Service
public class AccountServiceSingleton {

    private String name = "Lori";

    public void changeName(String name) {
        this.name = name + "--------" + name;
    }

    public String getName() {
        return name;
    }
}
