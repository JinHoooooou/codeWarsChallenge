package codeWars.kyu7.simpleRemoveDuplicates_20201204;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] arr = {3, 4, 4, 3, 6, 3};
    assertThat(Solution.solve(arr), is(new int[]{4, 6, 3}));
  }

  @Test
  public void test2() {
    int[] arr = {1, 2, 1, 2, 1, 2, 3};
    assertThat(Solution.solve(arr), is(new int[]{1, 2, 3}));
  }

  @Test
  public void test3() {
    int[] arr = {1, 2, 3, 4};
    assertThat(Solution.solve(arr), is(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test4() {
    int[] arr = {1, 1, 4, 5, 1, 2, 1};
    assertThat(Solution.solve(arr), is(new int[]{4, 5, 2, 1}));
  }
}