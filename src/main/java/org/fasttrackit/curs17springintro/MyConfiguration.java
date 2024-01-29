package org.fasttrackit.curs17springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Engine myEngine(){
        return new Engine(200);
    }
}
