package codeWars.sumOfOddNumbers_20200412;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RowSumOddNumbersTest {

  @Test
  public void testShouldReturn1WhenInputIs1() {
    // Given: Set input is 1
    int given = 1;

    // When: Call rowSumOddNumbers method
    int actual = RowSumOddNumbers.rowSumOddNumbers(given);

    // Then: Should return 1
    assertEquals(1, actual);
  }

  @Test
  public void testShouldReturn8WhenInputIs2() {
    // Given: Set input is 2
    int given = 2;

    // When: Call rowSumOddNumbers method
    int actual = RowSumOddNumbers.rowSumOddNumbers(given);

    // Then: Should return 8
    assertEquals(8, actual);
  }

  @Test
  public void testShouldReturn27WhenInputIs3() {
    // Given: Set input is 3
    int given = 3;

    // When: Call rowSumOddNumbers method
    int actual = RowSumOddNumbers.rowSumOddNumbers(given);

    // Then: Should return 27
    assertEquals(27, actual);
  }

  @Test
  public void testShouldReturn64WhenInputIs4() {
    // Given: Set input is 4
    int given = 4;

    // When: Call rowSumOddNumbers method
    int actual = RowSumOddNumbers.rowSumOddNumbers(given);

    // Then: Should return 81
    assertEquals(64, actual);
  }
}