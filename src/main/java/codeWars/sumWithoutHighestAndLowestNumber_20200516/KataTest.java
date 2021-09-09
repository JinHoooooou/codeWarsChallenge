package codeWars.sumWithoutHighestAndLowestNumber_20200516;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 16 when input [6, 2, 1, 8, 10]")
  public void test1() {
    // Given: Set array
    int[] given = {6, 2, 1, 8, 10};

    // Then: Should return 16
    assertEquals(16, Kata.sum(given));
  }

  @Test
  @DisplayName("test should return 0 when input null or empty or length 1")
  public void test2() {
    // Given: Set empty array
    int[] given = {};

    // Then: Should return 0
    assertEquals(0, Kata.sum(given));
  }
}