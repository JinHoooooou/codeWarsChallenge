package codeWars.convertNumberToString_20200330;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldString123WhenInputIsInteger123() {
    // Given: Set input 123
    int given = 123;

    // When: Call numberToString method
    String actual = Kata.numberToString(given);

    // Then:
    assertEquals("123", actual);
  }

  @Test
  public void testShouldStringMinus123WhenInputIsIntegerMinus123() {
    // Given: Set input -123
    int given = -123;

    // When: Call numberToString method
    String actual = Kata.numberToString(given);

    // Then:
    assertEquals("-123", actual);
  }

}