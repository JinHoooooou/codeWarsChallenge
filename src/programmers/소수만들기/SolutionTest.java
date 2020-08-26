package programmers.소수만들기;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    assertEquals(1, solution.solution(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2() {
    assertEquals(4, solution.solution(new int[]{1, 2, 7, 6, 4}));
  }
}