package com.saul.kafka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.run;

/**
 * Main Application
 */
@SpringBootApplication
@EnableScheduling
public class SpringBottApplication {

  public static void main(String[] args) {
    run(SpringBottApplication.class, args);
  }
}
