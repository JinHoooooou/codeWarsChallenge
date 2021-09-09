package programmers.level2.최솟값만들기_20201027;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}), is(29));
  }
}