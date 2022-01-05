package codeWars.kyu8.stringyStrings_20200617;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return '10'")
  public void test1() {

    // Then: Should return '10'
    assertEquals("10", Kata.stringy(2));
  }
}