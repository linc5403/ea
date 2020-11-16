package com.example.factorybeandemo;

import com.example.factorybeandemo.bean.Animal;
import com.example.factorybeandemo.bean.AnimalFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FactoryBeanDemoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(FactoryBeanDemoApplication.class, args);
        /*
        AnimalFactory animalFactory = context.getBean(AnimalFactory.class);
        animalFactory.setSpec("dog");
        animalFactory.getObject();
        Animal animal = context.getBean(Animal.class);
        animal.sayHello();
         */
        Animal animal = context.getBean("cat", Animal.class);
        animal.sayHello();
//        animal = context.getBean("dog", Animal.class);
//        animal.sayHello();
    }

}
