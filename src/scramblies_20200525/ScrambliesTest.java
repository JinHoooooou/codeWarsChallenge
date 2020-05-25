package scramblies_20200525;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScrambliesTest {

  @Test
  @DisplayName("test should true when input 'rkqodlw', 'world'")
  public void test1() {
    // Then: Should true
    assertTrue(Scramblies.scramble("rkqodlw", "world"));
  }
}