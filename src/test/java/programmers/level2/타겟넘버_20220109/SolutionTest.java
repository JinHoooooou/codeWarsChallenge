package programmers.level2.타겟넘버_20220109;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{1, 1, 1, 1, 1}, 3), is(5));
  }
}