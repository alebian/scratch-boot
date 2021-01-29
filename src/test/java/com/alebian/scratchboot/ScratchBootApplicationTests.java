package com.alebian.scratchboot;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScratchBootApplicationTests {
  @Test
  public void contextLoads() {
    assertFalse("1".isEmpty(), "Dummy test");
  }
}
