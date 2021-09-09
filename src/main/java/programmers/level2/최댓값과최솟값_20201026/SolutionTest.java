package programmers.level2.최댓값과최솟값_20201026;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("1 2 3 4"), is("1 4"));
  }
}