package doNotSolve.programmers.level2.큰수만들기_20201012;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("1231234", 3), is("3234"));
    assertThat(new AnotherSolution().solution("1231234", 3), is("3234"));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("4177252841", 4), is("775841"));
    assertThat(new AnotherSolution().solution("4177252841", 4), is("775841"));
  }
}