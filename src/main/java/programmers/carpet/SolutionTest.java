package programmers.carpet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    assertArrayEquals(new int[]{8, 6}, solution.solution(24, 24));
  }
}