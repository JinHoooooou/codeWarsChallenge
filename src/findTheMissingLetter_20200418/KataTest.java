package findTheMissingLetter_20200418;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 'b' when input is {a, c}")
  public void testShouldReturnBWhenInputIsAAndC() {
    // Given: Set array {a, c}
    char[] given = {'a', 'c'};
    // When: Call findMissingLetter method
    char actual = Kata.findMissingLetter(given);
    // Then: Should return 'b'
    assertEquals('b', actual);
  }

  @Test
  @DisplayName("test should return 'Q' when input is {O, P, R, S, T}")
  public void testShouldReturnEWhenInputIsAAndBAndCAndDAndF() {
    // Given: Set array {a, b, c, d, f}
    char[] given = {'O', 'P', 'R', 'S', 'T'};
    // When: Call findMissingLetter method
    char actual = Kata.findMissingLetter(given);
    // Then: Should return 'Q'
    assertEquals('Q', actual);
  }
}