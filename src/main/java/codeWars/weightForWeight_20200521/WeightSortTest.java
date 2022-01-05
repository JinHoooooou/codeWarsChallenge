package codeWars.weightForWeight_20200521;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

  @Test
  @DisplayName("test should return 11 11 2000 10003 22 123 1234000 44444444 9999"
      + " when input 2000 10003 1234000 44444444 9999 11 11 22 123")
  public void test2() {
    // Given: Set weight list
    String given = "2000 10003 1234000 44444444 9999 11 11 22 123";

    // Then: should return 2000 103 123 4444 99
    assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight(given));
  }
}