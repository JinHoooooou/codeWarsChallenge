package SWExpertAcademy.grating_2819;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    // Given: Set input
    int[][] board = {
        {1, 1, 1, 1},
        {1, 1, 1, 2},
        {1, 1, 2, 1},
        {1, 1, 1, 1}
    };
    assertEquals(23, Solution.solution(board));
  }
}