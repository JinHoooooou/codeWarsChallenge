package sumOfFirstNthTermOfSeries_20200423;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NthSeriesTest {

  @Test
  @DisplayName("test should return 0.00 when input is 0")
  public void testShouldReturn0WhenInputIs0() {
    // Given: Set input 0
    int given = 0;
    // When: Call seriesSum method
    String actual = NthSeries.seriesSum(given);
    // Then: Should return "0.00"
    assertEquals("0.00", NthSeries.seriesSum(0));
  }

  @Test
  @DisplayName("test should return 1.00 when input is 1")
  public void test2() {
    // Given: Set input 1
    int given = 1;
    // When: Call seriesSum method
    String actual = NthSeries.seriesSum(given);
    // Then: Should return "1.00"
    assertEquals("1.00", actual);
  }

  @Test
  @DisplayName("test should return 1.25 when input is 2")
  public void test3() {
    // Given: Set input 2
    int given = 2;
    // When: Call seriesSum method
    String actual = NthSeries.seriesSum(given);
    // Then: Should return "1.25"
    assertEquals("1.25", actual);
  }

}