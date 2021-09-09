package programmers.findPrime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 3 when input '17'")
  public void test1() {
    // Then: Should return 3
    assertEquals(3, solution.solution("17"));
  }

  @Test
  @DisplayName("test should return 2 when input '011'")
  public void test2() {
    // Then: Should return 2
    assertEquals(2, solution.solution("011"));
  }
}