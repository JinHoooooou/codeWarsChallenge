package programmers.passingBridgeTruck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 8 when bridgeLength=2 weight=10 truck=[7,4,5,6]")
  public void test1() {
    // Given: Set input
    int bridgeLength = 2;
    int bridgeWeight = 10;
    int[] truckWeight = {7, 4, 5, 6};

    // Then: Should return 8
    assertEquals(8, solution.solution(bridgeLength, bridgeWeight, truckWeight));
  }

  @Test
  @DisplayName("test should return 101 when bridgeLength=100 weight=100 truck=[10]")
  public void test2() {
    // Given: Set input
    int bridgeLength = 100;
    int bridgeWeight = 100;
    int[] truckWeight = {10,10,10,10,10,10,10,10,10,10};

    // Then: Should return 110
    assertEquals(110, solution.solution(bridgeLength, bridgeWeight, truckWeight));
  }
}