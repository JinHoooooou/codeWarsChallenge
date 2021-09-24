package codeWars.kyu7.Largest_pair_sum_in_array_20210924;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return 42 on given array {10, 14, 2, 23, 19}")
  public void test1() {
    int[] array = new int[]{10, 14, 2, 23, 19};
    assertThat(Solution.largestPairSum(array), is(42));
  }

  @Test
  @DisplayName("test should return 0 on given array {-100, -29, -24, -19, 19}")
  public void test2() {
    int[] array = new int[]{-100, -29, -24, -19, 19};
    assertThat(Solution.largestPairSum(array), is(0));
  }

  @Test
  @DisplayName("test should return 10 on given array {1, 2, 3, 4, 6, -1, 2}")
  public void test3() {
    int[] array = new int[]{1, 2, 3, 4, 6, -1, 2};
    assertThat(Solution.largestPairSum(array), is(10));
  }

  @Test
  @DisplayName("test should return -18 on given array {-10, -8, -16, -18, -19}")
  public void test4() {
    int[] array = new int[]{-10, -8, -16, -18, -19};
    assertThat(Solution.largestPairSum(array), is(-18));
  }
}