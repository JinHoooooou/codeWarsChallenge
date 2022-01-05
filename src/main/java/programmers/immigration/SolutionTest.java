package programmers.immigration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    int[] times = {7, 10};
    int n = 6;

    assertEquals(28, solution.solution(n, times));
  }
}