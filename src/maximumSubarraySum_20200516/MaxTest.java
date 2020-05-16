package maximumSubarraySum_20200516;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxTest {

  @Test
  @DisplayName("test should return 0 when input array empty")
  public void test1() {
    // Given: Set empty array
    int[] given = {};

    // Then: Should return 0
    assertEquals(0, Max.sequence(given));
  }

  @Test
  @DisplayName("test should return sum all element when input element all positive")
  public void test2() {
    // Given: Set array element all positive
    int[] given = {1, 2, 3, 4, 5};

    // Then: Should return 15
    assertEquals(15, Max.sequence(given));
  }

  @Test
  @DisplayName("test should return 0 when input element all negative")
  public void test3() {
    // Given: Set array element all negative
    int[] given = {-11, -2, -43, -124, -65};

    // Then: Should return 0
    assertEquals(0, Max.sequence(given));
  }
}