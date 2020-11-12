package programmers.level1.실패율_20201112;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    int[] expected = {3, 4, 2, 1, 5};
    assertThat(new Solution().solution(5, stages), is(expected));
  }

  @Test
  public void test2() {
    int[] stages = {4, 4, 4, 4};
    int[] expected = {4, 1, 2, 3};
    assertThat(new Solution().solution(4, stages), is(expected));
  }
}