package programmers.level1.소수찾기_20201018;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(10), is(4));
  }
}