package doNotSolve.programmers.level2.단체사진찍기_20201019;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(0, new String[]{}), is(40320));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution(2, new String[]{"N~F=0", "R~T>2"}), is(3648));
  }

  @Test
  public void test3() {
    assertThat(new Solution().solution(2, new String[]{"M~C<2", "C~M>1"}), is(0));
  }
}