package programmers.기둥과보설치;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    // Given:
    int n = 5;
    int[][] buildFrame = {
        {1, 0, 0, 1},
        {1, 1, 1, 1},
        {2, 1, 0, 1},
        {2, 2, 1, 1},
        {5, 0, 0, 1},
        {5, 1, 0, 1},
        {4, 2, 1, 1},
        {3, 2, 1, 1}
    };

    // Then:
    int[][] expected = {
        {1, 0, 0},
        {1, 1, 1},
        {2, 1, 0},
        {2, 2, 1},
        {3, 2, 1},
        {4, 2, 1},
        {5, 0, 0},
        {5, 1, 0},
    };

    assertArrayEquals(expected[0], solution.solution(n, buildFrame)[0]);
    assertArrayEquals(expected[1], solution.solution(n, buildFrame)[1]);
    assertArrayEquals(expected[2], solution.solution(n, buildFrame)[2]);
    assertArrayEquals(expected[3], solution.solution(n, buildFrame)[3]);
    assertArrayEquals(expected[4], solution.solution(n, buildFrame)[4]);
    assertArrayEquals(expected[5], solution.solution(n, buildFrame)[5]);
    assertArrayEquals(expected[6], solution.solution(n, buildFrame)[6]);
    assertArrayEquals(expected[7], solution.solution(n, buildFrame)[7]);
  }
}