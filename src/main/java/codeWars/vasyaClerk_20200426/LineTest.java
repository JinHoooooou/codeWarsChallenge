package codeWars.vasyaClerk_20200426;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {

  Line line = new Line();

  @Test
  @DisplayName("test should return No when input array length 0")
  public void testShouldReturnNoWhenInputArrayLength0() {
    // Given: Set line array length 0
    int[] given = new int[]{};
    // Then: Should return "NO"
    assertEquals(Line.NO, line.tickets(given));
  }

  @Test
  @DisplayName("test should return YES when input length 1 and element is 25")
  public void testShouldReturnYesWhenInputLength1AndValueIs25() {
    // Given: Set line array length 1 and value 25
    int[] given = new int[]{25};
    // Then: Should return "YES"
    assertEquals(Line.YES, line.tickets(given));
  }

  @Test
  @DisplayName("test should return NO when input length 1 and element is not 25")
  public void testShouldReturnYesWhenInputLength1AndValueIsNot25() {
    // Given: Set line array length 1 and value 50
    int[] given = new int[]{50};
    // Then: Should return "NO"
    assertEquals(Line.NO, line.tickets(given));
  }

  @Test
  @DisplayName("test should return NO when input is {25, 50, 50}")
  public void test1() {
    // Given: Set line array {25, 25, 50}
    int[] given = new int[]{25, 50, 50};
    // Then: Should return "NO"
    assertEquals(Line.NO, line.tickets(given));
  }

  @Test
  @DisplayName("test should return NO when input is {25, 100}")
  public void test2() {
    // Given: Set line array {25, 100}
    int[] given = new int[]{25, 100};
    // Then: Should return "NO"
    assertEquals(Line.NO, line.tickets(given));
  }
}