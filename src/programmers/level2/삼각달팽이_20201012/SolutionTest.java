package programmers.level2.삼각달팽이_20201012;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {


  @Test
  public void testWhenInput4() {
    assertThat(new Solution().solution(4), is(new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7}));
  }

  @Test
  public void testWhenInput5() {
    assertThat(new Solution().solution(5),
        is(new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9}));
  }
}