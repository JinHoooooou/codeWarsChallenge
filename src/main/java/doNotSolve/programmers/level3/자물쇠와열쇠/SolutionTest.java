package doNotSolve.programmers.level3.자물쇠와열쇠;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[][] key = {
        {0, 0, 0},
        {1, 0, 0},
        {0, 1, 1}
    };
    int[][] lock = {
        {1, 1, 1},
        {1, 1, 0},
        {1, 0, 1}
    };
    assertThat(new Solution().solution(key, lock), is(true));
  }
}