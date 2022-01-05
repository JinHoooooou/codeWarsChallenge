package codeWars.scramblies_20200525;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScrambliesTest {

  @Test
  @DisplayName("test should true when input 'rkqodlw', 'world'")
  public void test1() {
    // Then: Should true
    assertTrue(Scramblies.scramble("rkqodlw", "world"));
  }

  @Test
  @DisplayName("test should false when input 'katas', 'steak'")
  public void test2() {
    // Then: Should false
    assertFalse(Scramblies.scramble("katas", "steak"));
  }
}