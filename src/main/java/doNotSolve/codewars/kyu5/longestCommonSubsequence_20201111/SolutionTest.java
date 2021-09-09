package doNotSolve.codewars.kyu5.longestCommonSubsequence_20201111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution.lcs("abcdef", "abc"), is("abc"));
  }

  @Test
  public void test2() {
    assertThat(Solution.lcs("abcdef", "acf"), is("acf"));
  }

  @Test
  public void test3() {
    assertThat(Solution.lcs("132535365", "123456789"), is("12356"));
  }
}