package programmers.길찾기게임;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    // Given: Set input
    int[][] nodeInfo = {
        {5, 3},
        {11, 5},
        {13, 3},
        {3, 5},
        {6, 1},
        {1, 3},
        {8, 6},
        {7, 2},
        {2, 2}
    };

    assertArrayEquals(new int[]{7, 4, 6, 9, 1, 8, 5, 2, 3}, solution.solution(nodeInfo)[0]);
    assertArrayEquals(new int[]{9, 6, 5, 8, 1, 4, 3, 2, 7}, solution.solution(nodeInfo)[1]);
  }
}