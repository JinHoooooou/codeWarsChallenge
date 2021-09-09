package doNotSolve.programmers.level3.N으로표현;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(5, 12), is(4));
    assertThat(new Solution().solution(2, 11), is(3));
    assertThat(new Solution().solution(5, 5), is(1));
    assertThat(new Solution().solution(5, 10), is(2));
    assertThat(new Solution().solution(5, 31168), is(-1));
    assertThat(new Solution().solution(1, 1121), is(7));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution(5, 1010), is(7));
    assertThat(new Solution().solution(3, 4), is(3));
    assertThat(new Solution().solution(5, 5555), is(4));
    assertThat(new Solution().solution(5, 5550), is(5));
  }

  @Test
  public void test3() {
    assertThat(new Solution().solution(5, 20), is(3));
    assertThat(new Solution().solution(3, 30), is(3));
    assertThat(new Solution().solution(6, 65), is(4));
    assertThat(new Solution().solution(5, 2), is(3));
    assertThat(new Solution().solution(5, 4), is(3));
    assertThat(new Solution().solution(1, 1), is(1));
    assertThat(new Solution().solution(1, 11), is(2));
    assertThat(new Solution().solution(1, 111), is(3));
    assertThat(new Solution().solution(1, 1111), is(4));
    assertThat(new Solution().solution(1, 11111), is(5));
    assertThat(new Solution().solution(7, 7776), is(6));
    assertThat(new Solution().solution(7, 7784), is(5));
  }
}