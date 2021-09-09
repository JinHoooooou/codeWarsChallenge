package codeWars.whatPerfectPowerAnyway_20200417;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PerfectPowerTest {

  @Test
  public void testShouldNullWhenInputIs0() {
    // Given: Set input 0
    int given = 0;
    // When: Call isPerfectPower method
    int[] actual = PerfectPower.isPerfectPower(given);
    // Then: Should return null
    assertEquals(null, actual);
  }

  @Test
  public void testShouldNullWhenInputIs2() {
    // Given: Set input 2
    int given = 2;
    // When: Call isPerfectPower method
    int[] actual = PerfectPower.isPerfectPower(given);
    // Then: Should return null
    assertEquals(null, actual);
  }

  @Test
  @DisplayName("testShould{2,2}WhenInputIs4")
  public void testShould2And2WhenInputIs4() {
    // Given: Set input 4
    int given = 4;
    // When: Call isPerfectPower method
    int[] actual = PerfectPower.isPerfectPower(given);
    // Then: Should return {2, 2}
    assertArrayEquals(new int[]{2,2}, actual);
  }

  @Test
  @DisplayName("testShould{2,3}WhenInputIs8")
  public void testShould2And3WhenInputIs8() {
    // Given: Set input 8
    int given = 8;
    // When: Call isPerfectPower method
    int[] actual = PerfectPower.isPerfectPower(given);
    // Then: Should return {2, 2}
    assertArrayEquals(new int[]{2,3}, actual);
  }

  @Test
  @DisplayName("testShould{3,2}WhenInputIs9")
  public void testShould3And2WhenInputIs9() {
    // Given: Set input 8
    int given = 9;
    // When: Call isPerfectPower method
    int[] actual = PerfectPower.isPerfectPower(given);
    // Then: Should return {3, 2}
    assertArrayEquals(new int[]{3,2}, actual);
  }
}