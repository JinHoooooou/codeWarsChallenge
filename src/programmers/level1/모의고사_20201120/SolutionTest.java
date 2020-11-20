package programmers.level1.모의고사_20201120;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}), is(new int[]{1}));
  }
}