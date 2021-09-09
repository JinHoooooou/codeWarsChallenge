package programmers.level2.n진수게임_20210119;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution(2, 4, 2, 1), is("0111"));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution(16, 16, 2, 1), is("02468ACE11111111"));
  }

  @Test
  public void test3() {
    assertThat(new Solution().solution(16, 16, 2, 2), is("13579BDF01234567"));
  }
}