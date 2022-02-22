package codewars._6kyu.Are_we_alternate_20220222;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    String s = "amazon";
    assertThat(Solution.isAlt(s), is(true));
  }

  @Test
  public void test2() {
    String s = "apple";
    assertThat(Solution.isAlt(s), is(false));
  }

  @Test
  public void test3() {
    String s = "banana";
    assertThat(Solution.isAlt(s), is(true));
  }
}