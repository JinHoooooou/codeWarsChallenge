package doNotSolve.programmers.level2.가장큰정사각형찾기_20201018;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[][] board = {
        {0, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {0, 0, 0, 1}
    };
    assertThat(new Solution().solution(board), is(9));
  }

  @Test
  public void test2() {
    int[][] board = {
        {0, 0, 1, 1},
        {1, 1, 1, 1},
    };
    assertThat(new Solution().solution(board), is(4));
  }

  @Test
  public void test3() {
    int[][] board = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
    };
    assertThat(new Solution().solution(board), is(16));
  }

  @Test
  public void test4() {
    int[][] board = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 0, 1, 1},
    };
    assertThat(new Solution().solution(board), is(9));
  }

  @Test
  public void test5() {
    int[][] board = {
        {1, 0, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 0, 1, 1},
    };
    assertThat(new Solution().solution(board), is(4));
  }
}