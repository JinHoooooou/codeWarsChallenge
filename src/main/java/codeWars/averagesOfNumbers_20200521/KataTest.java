package codeWars.averagesOfNumbers_20200521;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return [2, 4, 3, -4.5] when input [1, 3, 5, 1, -10]")
  public void test1() {
    // Given: Set int array
    int[] given = {1, 3, 5, 1, -10};

    // Then: should return {2, 4, 3, -4.5}
    assertArrayEquals(new double[]{2, 4, 3, -4.5}, Kata.averages(given));
  }
}