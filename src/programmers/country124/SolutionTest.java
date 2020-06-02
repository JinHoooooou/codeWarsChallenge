package programmers.country124;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 1 when input 1")
  public void test1() {
    // Then: Should return 1
    assertEquals("41", solution.solution(10));
  }
}