package sortTheOdd_20200504;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return empty array when input is empty array")
  public void test1() {
    // Given: Set empty array
    int[] given = new int[]{};

    // Then: Should return empty array
    assertArrayEquals(given, Kata.sortArray(given));
  }

  @Test
  @DisplayName("test should return ascending sorted array when input has only odd elements")
  public void test2() {
    // Given: Set array has only odd number
    int[] given = new int[]{7, 3, 5, 1, 9, 17, 13, 29, 45};

    // Then: Should return ascending sorted array
    assertArrayEquals(new int[]{1, 3, 5, 7, 9, 13, 17, 29, 45}, Kata.sortArray(given));
  }

  @Test
  @DisplayName("test should return even number be their places")
  public void test3() {
    // Given: Set array has odd and even number
    int[] given = new int[]{5, 3, 2, 8, 1, 4};

    // Then: Should return ascending sorted array
    assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, Kata.sortArray(given));
  }
}