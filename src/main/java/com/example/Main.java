package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.example")
public class Main extends SpringBootServletInitializer {

        public static void main(String[] args) {
            SpringApplication.run(Main.class, args);
        }
    }

