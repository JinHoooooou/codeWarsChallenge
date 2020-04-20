package buildPileOfCubes_20200420;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ASumTest {

  @Test
  public void testShouldReturn1WhenInput1() {
    // Given: Set long 1
    long given = 1;
    // When: Call findNb method
    long actual = ASum.findNb(given);
    // Then: Should return 1
    assertEquals(1, actual);
  }

  @Test
  public void testShouldReturn2WhenInput9() {
    // Given: Set long 9
    long given = 9;
    // When: Call findNb method
    long actual = ASum.findNb(given);
    // Then: Should return 2
    assertEquals(2, actual);
  }

  @Test
  public void testShouldReturnNegative1WhenInput8() {
    // Given: Set long 8
    long given = 8;
    // When: Call findNb method
    long actual = ASum.findNb(given);
    // Then: Should return -1
    assertEquals(-1, actual);
  }

  @Test
  public void testShouldReturn45WhenInput1071225() {
    // Given: Set long 1071225
    long given = 1071225;
    // When: Call findNb method
    long actual = ASum.findNb(given);
    // Then: Should return 45
    assertEquals(45, actual);
  }



}