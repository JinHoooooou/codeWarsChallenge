package codeWars.kyu8.removeExclamationMarks_20200610;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return \"Hello World\" when input \"Hello World!\"")
  public void test() {
    // Then: Should return "Hello World"
    assertEquals("Hello World", solution.removeExclamationMarks("Hello World!"));
  }
}