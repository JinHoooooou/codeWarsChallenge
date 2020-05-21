package weightForWeight_20200521;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WeightSortTest {

  @Test
  @DisplayName("test should return 2000 103 123 4444 99 when input 103 123 4444 99 2000")
  public void test() {
    // Given: Set weight list
    String given = "103 123 4444 99 2000";

    // Then: should return 2000 103 123 4444 99
    assertEquals("2000 103 123 4444 99", WeightSort.orderWeight(given));
  }
}