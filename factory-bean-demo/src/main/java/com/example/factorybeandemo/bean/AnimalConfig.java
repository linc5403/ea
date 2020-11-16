package com.example.factorybeandemo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {

//    final private AnimalFactory animalFactory = new AnimalFactory();

    @Bean(name = "cat")
    public AnimalFactory animalFactory() {
        AnimalFactory factory = new AnimalFactory();
        factory.setSpec("cat");
        return factory;
    }

//    @Bean(name="cat")
//    public Animal getCat() throws Exception {
//        animalFactory.setSpec("cat");
//        return animalFactory.getObject();
//    }
//
//    @Bean(name="dog")
//    public Animal getDog() throws Exception {
//        animalFactory.setSpec("dog");
//        return animalFactory.getObject();
//    }

}
