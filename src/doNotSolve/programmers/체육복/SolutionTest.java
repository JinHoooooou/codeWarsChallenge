package doNotSolve.programmers.체육복;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    // Given:
    int n = 5;
    int[] lost = {2, 4};
    int[] reserve = {1, 3, 5};

    // Then:
    assertEquals(5, new Solution().solution(n, lost, reserve));
  }
}