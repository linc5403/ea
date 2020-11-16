package com.example.factorybeandemo.bean;

public class Dog implements Animal{
    @Override
    public void sayHello() {
        System.out.println("This is a dog!");
    }
}
