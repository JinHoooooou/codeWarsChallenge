package programmers.level1.예산_20201111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] d = {1, 3, 2, 5, 4};
    assertThat(new Solution().solution(d, 9), is(3));
  }
}