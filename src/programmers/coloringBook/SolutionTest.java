package programmers.coloringBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return [4,5] when m=6, n=4,"
      + "picture=[[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]")
  public void test1() {
    // Given:
    int m = 6;
    int n = 4;
    int[][] picture = {
        {1, 1, 1, 0},
        {1, 2, 2, 0},
        {1, 0, 0, 1},
        {0, 0, 0, 1},
        {0, 0, 0, 3},
        {0, 0, 0, 3}};

    // Then: Should return [4,5]
    assertArrayEquals(new int[]{4, 5}, solution.solution(m, n, picture));
  }
}