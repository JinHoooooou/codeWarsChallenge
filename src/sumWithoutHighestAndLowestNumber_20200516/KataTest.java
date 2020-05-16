package sumWithoutHighestAndLowestNumber_20200516;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 16 when input [6, 2, 1, 8, 10]")
  public void testShouldFail() {
    // Given: Set array
    int[] given = {6, 2, 1, 8, 10};

    // Then: Should return 16
    assertEquals(16, Kata.sum(given));
  }
}