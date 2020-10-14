package doNotSolve.programmers.level2.가장큰수;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(new int[]{6, 10, 2}), is("6210"));
  }
}