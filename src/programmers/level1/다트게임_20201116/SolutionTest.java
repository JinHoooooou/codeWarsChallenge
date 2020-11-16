package programmers.level1.다트게임_20201116;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("1S2D*10T"), is(1010));
  }
}