package doNotSolve.programmers.level2.행렬의곱셈_20201110;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[][] arr1 = {
        {1, 4},
        {3, 2},
        {4, 1}
    };
    int[][] arr2 = {
        {3, 3},
        {3, 3}
    };
    int[][] expected = {
        {15, 15},
        {15, 15},
        {15, 15}
    };
    assertThat(new Solution().solution(arr1, arr2), is(expected));
  }

  @Test
  public void test2() {
    int[][] arr1 = {
        {2, 3, 2},
        {4, 2, 4},
        {3, 1, 4}
    };
    int[][] arr2 = {
        {5, 4, 3},
        {2, 4, 1},
        {3, 1, 1}
    };
    int[][] expected = {
        {22, 22, 11},
        {36, 28, 18},
        {29, 20, 14}
    };
    assertThat(new Solution().solution(arr1, arr2), is(expected));
  }
}