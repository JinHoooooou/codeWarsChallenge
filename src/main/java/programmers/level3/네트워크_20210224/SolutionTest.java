package programmers.level3.네트워크_20210224;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[][] computers = {
        {1, 1, 0},
        {1, 1, 1},
        {0, 1, 1}
    };
    assertThat(new Solution().solution(3, computers), is(1));
  }

  @Test
  public void test2() {
    int[][] computers = {
        {1, 1, 0},
        {1, 1, 0},
        {0, 1, 1}
    };
    assertThat(new Solution().solution(3, computers), is(2));
  }
}