package programmers.targetNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 5 when numbers=[1,1,1,1,1] target=3")
  public void test1() {
    // Given: Set input
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;

    // Then: Should return 5
    assertEquals(5, solution.solution(numbers, target));
  }
}