package programmers.stockPrice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return [1,0] when input [3,4]")
  public void test1() {
    // Given: Set input
    int[] prices = {3, 4};

    // Then: Should return [1,0]
    assertArrayEquals(new int[]{1, 0}, solution.solution(prices));
  }

  @Test
  @DisplayName("test should return [4,3,1,1,0] when input [1,2,3,2,3]")
  public void test2() {
    // Given: Set input
    int[] prices = {1, 2, 3, 2, 3};

    // Then: Should return [4,3,1,1,0]
    assertArrayEquals(new int[]{4, 3, 1, 1, 0}, solution.solution(prices));
  }
}