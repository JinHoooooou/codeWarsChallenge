package codeWars.centuryFromYear_20200421;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testShouldReturn0WhenInputIsLessThan0() {
    // Given: Set integer less than (-5)
    int given = -5;
    // When: Call century method
    int actual = Solution.century(given);
    // Then: Should return 0
    assertEquals(0, actual);
  }

  @Test
  public void testShouldReturn18WhenInputIs1705() {
    // Given: Set integer 1705
    int given = 1705;
    // When: Call century method
    int actual = Solution.century(given);
    // Then: Should return 18
    assertEquals(18, actual);
  }

  @Test
  public void testShouldReturn19WhenInputIs1900() {
    // Given: Set integer 1900
    int given = 1900;
    // When: Call century method
    int actual = Solution.century(given);
    // Then: Should return 19
    assertEquals(19, actual);
  }
}