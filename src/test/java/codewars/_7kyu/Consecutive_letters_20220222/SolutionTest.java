package codewars._7kyu.Consecutive_letters_20220222;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    String s = "abc";
    assertThat(Solution.solve(s), is(true));
  }

  @Test
  public void test2() {
    String s = "abd";
    assertThat(Solution.solve(s), is(false));
  }

  @Test
  public void test3() {
    String s = "dabc";
    assertThat(Solution.solve(s), is(true));
  }

  @Test
  public void test4() {
    String s = "abbc";
    assertThat(Solution.solve(s), is(false));
  }

  @Test
  public void test5() {
    String s = "v";
    assertThat(Solution.solve(s), is(true));
  }
}