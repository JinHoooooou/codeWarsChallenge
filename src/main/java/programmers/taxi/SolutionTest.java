package programmers.taxi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    assertEquals(4, solution.solution(new int[]{1, 2, 4, 3, 3}));
  }

  @Test
  public void test2() {
    assertEquals(5, solution.solution(new int[]{2, 3, 4, 4, 2, 1, 3, 1}));
  }


}