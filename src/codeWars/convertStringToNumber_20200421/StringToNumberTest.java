package codeWars.convertStringToNumber_20200421;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToNumberTest {

  @Test
  public void testShouldReturn1234() {
    // Given: Set string "1234"
    String given = "1234";
    // When: Call stringToNumber method
    int actual = StringToNumber.stringToNumber(given);
    // Then: Should return integer 1234
    assertEquals(1234, actual);
  }

  @Test
  public void testShouldReturnNegative1234() {
    // Given: Set string "-1234"
    String given = "-1234";
    // When: Call stringToNumber method
    int actual = StringToNumber.stringToNumber(given);
    // Then: Should return integer 1234
    assertEquals(-1234, actual);
  }
}