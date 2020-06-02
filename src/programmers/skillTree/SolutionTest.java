package programmers.skillTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 2 when skill='A', skillTree=[ABC,BAC,CD]")
  public void test1() {
    // Given: Set input
    String skill = "A";
    String[] skillTree = {"ABC", "BAC", "CD"};

    // Then: Should return 2
    assertEquals(2, solution.solution(skill, skillTree));
  }
}