package com.dmdev.beanscope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Service
@Scope("prototype")
public class AccountServicePrototype {

    private String name = "Lori";

    public void changeName(String name) {
        this.name = name + "--------" + name;
    }

    public String getName() {
        return name;
    }
}
