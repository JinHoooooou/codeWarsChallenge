package programmers.level3.합승택시요금_20210529;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    int[][] fares = {
        {4, 1, 10}, {3, 5, 24}, {5, 6, 2},
        {3, 1, 41}, {5, 1, 24}, {4, 6, 50},
        {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
    assertThat(solution.solution(6, 4, 6, 2, fares), is(82));
  }

  @Test
  public void test2() {
    int[][] fares = {
        {5, 7, 9}, {4, 6, 4},
        {3, 6, 1}, {3, 2, 3},
        {2, 1, 6}};

    assertThat(solution.solution(7, 3, 4, 1, fares), is(14));
  }

  @Test
  public void test3() {
    int[][] fares = {
        {2, 6, 6}, {6, 3, 7}, {4, 6, 7},
        {6, 5, 11}, {2, 5, 12}, {5, 3, 20},
        {2, 4, 8}, {4, 3, 9}};

    assertThat(solution.solution(6, 4, 5, 6, fares), is(18));
  }
}