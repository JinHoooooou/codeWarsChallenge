package programmers.constructTrack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();
  AnotherSolution anotherSolution = new AnotherSolution();

  @Test
  @DisplayName("test when 3x3 board with no block")
  public void test1() {
    // Given: Set board
    int[][] board = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    };

    assertEquals(900, solution.solution(board));
    assertEquals(900, AnotherSolution.solution(board));
  }

  @Test
  @DisplayName("test when 3x3 board with block")
  public void test2() {
    // Given: Set board
    int[][] board = {
        {0, 0, 1},
        {0, 0, 0},
        {1, 0, 0}
    };

    assertEquals(1400, solution.solution(board));
    assertEquals(1400, AnotherSolution.solution(board));
  }

  @Test
  @DisplayName("test when 4x4 board with no block")
  public void test3() {
    // Given: Set board
    int[][] board = {
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };

    assertEquals(1100, solution.solution(board));
    assertEquals(1100, AnotherSolution.solution(board));
  }

  @Test
  @DisplayName("test when 4x4 board with block")
  public void test4() {
    // Given: Set board
    int[][] board = {
        {0, 0, 1, 0},
        {1, 0, 0, 0},
        {0, 1, 0, 1},
        {0, 0, 0, 0}
    };

    assertEquals(2600, solution.solution(board));
    assertEquals(2600, AnotherSolution.solution(board));
  }

  @Test
  @DisplayName("test when 5x5 board with no block")
  public void test5() {
    // Given: Set board
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
    };

    assertEquals(1300, solution.solution(board));
    assertEquals(1300, AnotherSolution.solution(board));
  }

  @Test
  @DisplayName("test when 5x5 board with block")
  public void test6() {
    // Given: Set board
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 1, 0, 0},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 0, 0}
    };

    assertEquals(3000, AnotherSolution.solution(board));
  }

  @Test
  @DisplayName("test when 6x6 board with block")
  public void test7() {
    // Given: Set board
    int[][] board = {
        {0, 0, 0, 0, 0, 0},
        {0, 1, 1, 1, 1, 0},
        {0, 0, 1, 0, 0, 0},
        {1, 0, 0, 1, 0, 1},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0},
    };

    assertEquals(3200, solution.solution(board));
    assertEquals(3200, AnotherSolution.solution(board));
  }
}