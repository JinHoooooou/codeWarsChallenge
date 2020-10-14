package doNotSolve.programmers.level2.멀쩡한_사각형;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhen1x1() {
    assertThat(new Solution().solution(1, 1), is(0L));
  }

  @Test
  public void testWhen2x2() {
    assertThat(new Solution().solution(2, 2), is(2L));
  }

  @Test
  public void testWhen2x3() {
    assertThat(new Solution().solution(2, 3), is(2L));
  }

  @Test
  public void testWhen8x12() {
    assertThat(new Solution().solution(8, 12), is(80L));
  }
}