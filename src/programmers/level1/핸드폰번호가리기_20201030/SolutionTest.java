package programmers.level1.핸드폰번호가리기_20201030;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("01033334444"), is("*******4444"));
  }
}