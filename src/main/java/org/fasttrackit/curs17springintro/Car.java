package org.fasttrackit.curs17springintro;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine){
        System.out.println("Car was created");
        System.out.println(engine);
        this.engine = engine;
    }

}
