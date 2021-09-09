package programmers.level2.숫자의표현_20201025;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenInputIs15() {
    assertThat(new Solution().solution(15), is(4));
  }
}