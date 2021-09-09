package programmers.level2.jadenCase문자열만들기_20201111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("3people   unFollowed   me"),
        is("3people   Unfollowed   Me"));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("  3people   unFollowed   me  "),
        is("  3people   Unfollowed   Me  "));
  }
}