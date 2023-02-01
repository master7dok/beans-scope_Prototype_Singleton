package com.dmdev.beanscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BaseService2 implements CommandLineRunner {

    @Autowired
    private AccountServicePrototype accountServicePrototype;
    @Autowired
    private AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {


        System.out.println("----------Prototype2--------");
        System.out.println(accountServicePrototype.getName());

        System.out.println("-----Singleton2------");
        System.out.println(accountServiceSingleton.getName());
    }
}
