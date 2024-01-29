package org.fasttrackit.curs17springintro;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Engine {
    private int horsePower;

    public Engine() {
        System.out.println("One Engine was created");
    }

    public Engine(int horsePower) {
        System.out.println("One special Engine was created");
        this.horsePower = horsePower;
    }
}
