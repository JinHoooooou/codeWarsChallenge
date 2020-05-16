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

    // When: Call sequence method
    int actual = Max.sequence(given);

    // Then: Should return 0
    assertEquals(0, actual);
  }
}