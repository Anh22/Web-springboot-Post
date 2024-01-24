package com.example.websevicepost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServicePostApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServicePostApplication.class, args);
        System.out.println("http://localhost:8080/api/posts");
    }

}
