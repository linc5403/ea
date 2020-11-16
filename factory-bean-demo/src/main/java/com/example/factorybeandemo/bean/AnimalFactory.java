package com.example.factorybeandemo.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

public class AnimalFactory implements FactoryBean<Animal> {
    public AnimalFactory() {
        System.out.println("construct factory!!!!");
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    private String spec;

    @Override
    public Animal getObject() throws Exception {
        if ("dog".equals(spec)) {
            return new Dog();
        } else if ("cat".equals(spec)) {
            return new Cat();
        }
        else
            return null;
    }

    @Override
    public Class<?> getObjectType() {
        if ("dog".equals(spec)) {
            return Dog.class;
        } else if ("cat".equals(spec)) {
            return Cat.class;
        }
        else
            return null;
    }
}
