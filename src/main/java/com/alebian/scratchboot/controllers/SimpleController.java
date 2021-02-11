package com.alebian.scratchboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
  @GetMapping("/hello")
  public String helloWorld() {
    return "Hello world!";
  }
}
