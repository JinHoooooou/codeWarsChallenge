package programmers.phoneNumberList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should false when input [\"119\", \"97674223\", \"1195524421\"]")
  public void test1() {
    // Given: Set input
    String[] phoneBook = {"119", "97674223", "1195524421"};

    // Then: Should false
    assertFalse(solution.solution(phoneBook));
  }

  @Test
  @DisplayName("test should true when input [\"123\",\"456\",\"789\"]")
  public void test2() {
    // Given: Set input
    String[] phoneBook = {"123", "456", "789"};

    // Then: Should true
    assertTrue(solution.solution(phoneBook));
  }

  @Test
  @DisplayName("test should true when input [\"12\",\"123\",\"1235\",\"567\",\"88\"]")
  public void test3() {
    // Given: Set input
    String[] phoneBook = {"12", "123", "1235", "567", "88"};

    // Then: Should false
    assertFalse(solution.solution(phoneBook));
  }
}