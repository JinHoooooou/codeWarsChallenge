package codewars._7kyu.Find_all_pairs_20220315;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    int[] array = {1, 2, 5, 6, 5, 2};
    int expected = 2;

    assertThat(Solution.duplicates(array), is(expected));
  }

  @Test
  public void test2() {
    int[] array = {1, 2, 2, 20, 6, 20, 2, 6, 2};
    int expected = 4;

    assertThat(Solution.duplicates(array), is(expected));
  }

  @Test
  public void test3() {
    int[] array = {0, 0, 0, 0, 0, 0, 0};
    int expected = 3;

    assertThat(Solution.duplicates(array), is(expected));
  }

  @Test
  public void test4() {
    int[] array = {1000, 1000};
    int expected = 1;

    assertThat(Solution.duplicates(array), is(expected));
  }

  @Test
  public void test5() {
    int[] array = {};
    int expected = 0;

    assertThat(Solution.duplicates(array), is(expected));
  }

  @Test
  public void test6() {
    int[] array = {1};
    int expected = 0;

    assertThat(Solution.duplicates(array), is(expected));
  }
}