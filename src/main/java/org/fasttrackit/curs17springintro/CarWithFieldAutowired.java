package org.fasttrackit.curs17springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithFieldAutowired {
    @Autowired
    private Engine engine;

    public CarWithFieldAutowired(){
        System.out.println("created with field autowired");
    }
}
