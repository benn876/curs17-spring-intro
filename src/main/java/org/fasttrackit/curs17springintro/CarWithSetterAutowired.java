package org.fasttrackit.curs17springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithSetterAutowired {
    private Engine engine;

    public CarWithSetterAutowired(){
        System.out.println("create with setter autowired");
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
