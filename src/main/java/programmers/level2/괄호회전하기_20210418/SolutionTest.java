package programmers.level2.괄호회전하기_20210418;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testShouldFail() {
    assertThat(new Solution().solution("[](){}"), is(3));
  }
}