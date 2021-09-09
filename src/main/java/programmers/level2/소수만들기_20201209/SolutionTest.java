package programmers.level2.소수만들기_20201209;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{1, 2, 3, 4}), is(1));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution(new int[]{1, 2, 7, 6, 4}), is(4));
  }
}