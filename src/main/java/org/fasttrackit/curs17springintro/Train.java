package org.fasttrackit.curs17springintro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Train {
    private final Engine engine;

    public Train(Engine engine){
        System.out.println("Train was created");
        System.out.println(engine);
        this.engine = engine;
    }

//    public Train(Engine myEngine){
//        System.out.println("Train was created");
//        System.out.println(myEngine);
//        this.engine = myEngine;
//    }
}
