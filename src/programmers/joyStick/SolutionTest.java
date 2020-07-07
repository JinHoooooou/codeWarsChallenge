package programmers.joyStick;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 56 when input JEROEN")
  public void test1() {
    // Given: Set input
    String name = "JEROEN";

    // Then: Should return 56
    assertEquals(56, solution.solution(name));
  }

  @Test
  @DisplayName("test should return 23 when input JAN")
  public void test2() {
    // Given: Set input
    String name = "JAN";

    // Then: Should return 23
    assertEquals(23, solution.solution(name));
  }
}