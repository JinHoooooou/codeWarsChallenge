package codeWars.kyu7.wordValues_20201118;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    String[] arr = {"abc", "abc abc"};
    assertThat(Solution.nameValue(arr), is(new int[]{6, 24}));
  }

  @Test
  public void test2() {
    String[] arr = {"codewars", "abc", "xyz"};
    assertThat(Solution.nameValue(arr), is(new int[]{88, 12, 225}));
  }

  @Test
  public void test3() {
    String[] arr = {"abcdefghijklmnopqrstuvwxyz", "stamford bridge", "haskellers"};
    assertThat(Solution.nameValue(arr), is(new int[]{351, 282, 330}));
  }
}