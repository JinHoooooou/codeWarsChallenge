package reversedStrings_20200409;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturnInputStringWhenInputLength1() {
    // Given: Set String length 1
    String given = "a";
    // When: Call solution method
    String actual = Kata.solution(given);
    // Then: Should return given
    assertEquals(given, actual);
  }

  @Test
  public void testShouldReturnReverseStringWhenInputLengthMoreThan2() {
    // Given: Set String length more than 2
    String given = "world";
    // When: Call solution method
    String actual = Kata.solution(given);
    // Then: Should return given
    assertEquals("dlrow", actual);
  }

}