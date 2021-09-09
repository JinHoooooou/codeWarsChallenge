package programmers.level2.타겟넘버_20210320;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{1, 1, 1, 1, 1}, 3), is(5));
  }
}