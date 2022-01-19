package programmers.level3.네트워크_20220119;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    int[][] computers = {
        {1, 1, 0},
        {1, 1, 0},
        {0, 0, 1}
    };

    assertThat(new Solution().dfsSolution(3, computers), is(2));
  }

  @Test
  public void test2() {
    int[][] computers = {
        {1, 1, 0},
        {1, 1, 1},
        {0, 1, 1}
    };

    assertThat(new Solution().dfsSolution(3, computers), is(1));
  }
}