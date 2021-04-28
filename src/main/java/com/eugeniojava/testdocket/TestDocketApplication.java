package com.eugeniojava.testdocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TestDocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDocketApplication.class, args);
    }

}
