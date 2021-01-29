package com.alebian.scratchboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application entry point.
 */
@SuppressWarnings("PMD.UseUtilityClass")
@SpringBootApplication
public class ScratchBootApplication {
  public static void main(final String[] args) {
    SpringApplication.run(ScratchBootApplication.class, args);
  }
}
