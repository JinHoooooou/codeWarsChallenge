package programmers.level2.점프와순간이동_20201119;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenInput1to10() {
    assertThat(new Solution().solution(1), is(1));
    assertThat(new Solution().solution(2), is(1));
    assertThat(new Solution().solution(3), is(2));
    assertThat(new Solution().solution(4), is(1));
    assertThat(new Solution().solution(5), is(2));
    assertThat(new Solution().solution(6), is(2));
    assertThat(new Solution().solution(7), is(3));
    assertThat(new Solution().solution(8), is(1));
    assertThat(new Solution().solution(9), is(2));
    assertThat(new Solution().solution(10), is(2));
  }

  @Test
  public void testWhenInput5000() {
    assertThat(new Solution().solution(5000), is(5));
  }
}