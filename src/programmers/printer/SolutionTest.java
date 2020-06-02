package programmers.printer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 1 when priorities=[2,1,3,2] location=2")
  public void test1() {
    // Given: Set given
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;

    // Then: should return 5
    assertEquals(5, solution.solution(priorities, location));
  }
}