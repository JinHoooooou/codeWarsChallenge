package programmers.level2.HIndex_20201014;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{3, 0, 6, 1, 5}), is(3));
  }
}