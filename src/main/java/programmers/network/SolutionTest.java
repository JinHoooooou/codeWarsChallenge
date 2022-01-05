package programmers.network;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 2 when n=3, computers=[[1,1,0],[1,1,0],[0,0,1]]")
  public void test1() {
    // Given: Set input
    int n = 3;
    int[][] computers = {
        {1, 1, 0},
        {1, 1, 0},
        {0, 0, 1}
    };

    // Then: Should return 2
    assertEquals(2, solution.solution(n, computers));
  }

  @Test
  @DisplayName("test should return 1 when n=3, computers=[[1,1,0],[1,1,1],[0,1,1]]")
  public void test2() {
    // Given: Set input
    int n = 3;
    int[][] computers = {
        {1, 1, 0},
        {1, 1, 1},
        {0, 1, 1}
    };

    // Then: Should return 1
    assertEquals(1, solution.solution(n, computers));
  }
}