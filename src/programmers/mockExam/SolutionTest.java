package programmers.mockExam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return [1] when input [1,2,3,4,5]")
  public void test1() {
    // Given: Set input
    int[] answers = {1, 2, 3, 4, 5};

    // Then: Should return [1]
    assertArrayEquals(new int[]{1}, solution.solution(answers));
  }

  @Test
  @DisplayName("test should return [1,2,3] when input [1,3,2,4,2]")
  public void test2() {
    // Given: Set input
    int[] answers = {1, 3, 2, 4, 2};

    // Then: Should return [1,2,3]
    assertArrayEquals(new int[]{1, 2, 3}, solution.solution(answers));
  }
}