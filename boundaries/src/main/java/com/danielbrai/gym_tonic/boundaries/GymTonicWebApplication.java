package com.danielbrai.gym_tonic.boundaries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.danielbrai.*")
@EntityScan("com.danielbrai.*")
public class GymTonicWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymTonicWebApplication.class, args);
    }
}
