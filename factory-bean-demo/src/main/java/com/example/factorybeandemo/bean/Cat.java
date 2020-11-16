package com.example.factorybeandemo.bean;

public class Cat implements Animal {
    @Override
    public void sayHello() {
        System.out.println("This is a cat!");
    }
}
