package com.alebian.scratchboot;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.alebian.scratchboot.controllers.SimpleController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScratchBootApplicationTests {
  @Autowired
  private SimpleController controller;

  @Test
  public void contextLoads() {
    assertNotNull(controller);
  }
}
