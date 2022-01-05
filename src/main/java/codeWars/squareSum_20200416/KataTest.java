package codeWars.squareSum_20200416;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturn0WhenInputArrayLength1() {
    // Given: Set array length 0
    int[] given = new int[0];
    // When: Call squareSum method
    int actual = Kata.squareSum(given);
    // Then: Should return 0
    assertEquals(0, actual);
  }

  @Test
  public void testShouldReturn9WhenInputArrayElement1And1And2() {
    // Given: Set array length 3, element [1, 2, 2]
    int[] given = new int[] {1, 2, 2};
    // When: Call squareSum method
    int actual = Kata.squareSum(given);
    // Then: Should return 0
    assertEquals(9, actual);
  }
}