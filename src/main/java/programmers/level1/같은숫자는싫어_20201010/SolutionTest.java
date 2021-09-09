package programmers.level1.같은숫자는싫어_20201010;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{1, 1, 3, 3, 0, 1, 1}), is(new int[]{1, 3, 0, 1}));
  }
}