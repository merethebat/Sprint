// filepath: /airport-cli/src/main/java/com/example/airportcli/Main.java
package com.example.airportcli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to the Airport CLI!");
        // Add logic to interact with the API
    }
}