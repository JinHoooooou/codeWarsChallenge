package programmers.level2.N개의최소공배수_20201112;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{2, 6, 8, 14}), is(168));
  }
}