package programmers.eatingGroundGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 16")
  public void test1() {
    // Given: Set input
    int[][] land = {
        {1, 2, 3, 5},
        {5, 6, 7, 8},
        {4, 3, 2, 1}
    };

    // Then: Should return 16
    assertEquals(16, solution.solution(land));
  }

  @Test
  @DisplayName("test should return 2106")
  public void test2() {
    // Given: Set input
    int[][] land = {
        {1, 2, 3, 5},
        {5, 6, 7, 100},
        {4, 3, 2, 2000},
        {3, 4, 5, 1999}
    };

    // Then: Should return 2106
    assertEquals(2106, solution.solution(land));
  }
}