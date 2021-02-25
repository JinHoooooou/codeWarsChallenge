package programmers.level3.정수삼각형_20210225;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[][] triangle = {
        {7},
        {3, 8},
        {8, 1, 0},
        {2, 7, 4, 4},
        {4, 5, 2, 6, 5}
    };
    assertThat(new Solution().solution(triangle), is(30));
  }
}