package theSupermarketQueue_20200529;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return sum of array value when input till 1")
  public void test() {
    // Given: Set input
    int[] queue = {1, 2, 3, 4, 5};
    int tillCount = 1;

    // Then: should return 15
    assertEquals(15, Solution.solveSuperMarketQueue(queue, tillCount));
  }
}