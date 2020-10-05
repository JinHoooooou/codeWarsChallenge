package programmers.크레인_인형뽑기_게임;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 3},
        {0, 2, 5, 0, 1},
        {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}
    };
    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

    assertEquals(4, new Solution().solution(board, moves));
  }
}