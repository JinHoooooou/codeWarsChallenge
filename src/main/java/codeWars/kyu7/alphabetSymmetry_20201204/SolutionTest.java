package codeWars.kyu7.alphabetSymmetry_20201204;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    String[] arr = {"abode", "ABc", "xyzD"};
    assertThat(Solution.solve(arr), is(new int[]{4, 3, 1}));
  }

  @Test
  public void test2() {
    String[] arr = {"abide", "ABc", "xyz"};
    assertThat(Solution.solve(arr), is(new int[]{4, 3, 0}));
  }

  @Test
  public void test3() {
    String[] arr = {"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"};
    assertThat(Solution.solve(arr), is(new int[]{6, 5, 7}));
  }

  @Test
  public void test4() {
    String[] arr = {"encode", "abc", "xyzD", "ABmD"};
    assertThat(Solution.solve(arr), is(new int[]{1, 3, 1, 3}));
  }
}