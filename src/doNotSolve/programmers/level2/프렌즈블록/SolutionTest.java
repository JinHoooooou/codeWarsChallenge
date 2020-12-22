package doNotSolve.programmers.level2.프렌즈블록;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
    assertThat(new Solution().solution(4, 5, board), is(14));
  }

}