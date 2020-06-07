package programmers.phoneNumberList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should false when input [119, 97674223, 1195524421]")
  public void test1() {
    // Given: Set input
    String[] phoneBook = {"119", "97674223", "1195524421"};

    // Then: Should false
    assertFalse(solution.solution(phoneBook));
  }
}