package com.rubber.at.tennis.openai.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.rubber.*")
@SpringBootApplication
public class RubberServerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubberServerWebApplication.class, args);
    }

}
