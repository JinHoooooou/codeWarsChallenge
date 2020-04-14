package grassHopper_20200414;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrassHopperTest {
  GrassHopper grassHopper = new GrassHopper();

  @Test
  public void testShouldReturnSumFromOneToTen() {
    // Given: Set given 10
    int given = 10;
    // When: Call summation method
    int actual = grassHopper.summation(given);
    // Then: Should return sum of 1 to 10
    assertEquals(55, actual);
  }

  @Test
  public void testShouldReturnSumFromOneToHundred() {
    // Given: Set given 100
    int given = 100;
    // When: Call summation method
    int actual = grassHopper.summation(given);
    // Then: Should return sum of 1 to 10
    assertEquals(5050, actual);
  }
}