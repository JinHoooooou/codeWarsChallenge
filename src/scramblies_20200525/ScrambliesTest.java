package scramblies_20200525;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScrambliesTest {

  @Test
  @DisplayName("test should true when input 'rkqodlw', 'world'")
  public void test1() {
    // Given: Set input strings
    String given1 = "rkqodlw";
    String given2 = "world";

    // Then: Should true
    assertTrue(Scramblies.scramble(given1, given2));
  }
}