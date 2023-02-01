package com.dmdev.beanscope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
    @PostConstruct
    public void init() {
        System.out.println("*********" + getClass().getName() + "******* init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("*********" + getClass().getName() + "******* destroy method");
    }
}
