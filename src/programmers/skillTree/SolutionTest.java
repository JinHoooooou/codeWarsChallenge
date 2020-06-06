package programmers.skillTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  AnotherSolution solution = new AnotherSolution();

  @Test
  @DisplayName("test should return 2 when skill='A', skillTree=[ABC,BAC,CD]")
  public void test1() {
    // Given: Set input
    String skill = "A";
    String[] skillTree = {"ABC", "BAC", "CD"};

    // Then: Should return 2
    assertEquals(3, solution.solution(skill, skillTree));
  }

  @Test
  @DisplayName("test should return 6 when"
      + " skill='AB', skillTree=[AB, ABCD, CA, DACE, ACBD, CDAB, B, BA, CDBA, CBDA]")
  public void test2() {
    // Given: Set input
    String skill = "AB";
    String[] skillTree = {"AB", "ABCD", "CA", "DACE", "ACBD", "CDAB", "B", "BA", "CDBA", "CBDA"};

    // Then: Should return 6
    assertEquals(6, solution.solution(skill, skillTree));
  }
}