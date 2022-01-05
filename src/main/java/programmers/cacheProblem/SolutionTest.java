package programmers.cacheProblem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 50")
  public void test1() {
    // Given: Set input
    int cacheSize = 3;
    String[] cities = {"a", "b", "c", "d", "e", "a", "b", "c", "d", "e"};

    // Then: Should return 50
    assertEquals(50, solution.solution(cacheSize, cities));
  }

  @Test
  @DisplayName("test should case insensitive")
  public void test2() {
    // Given: Set input
    int cacheSize = 2;
    String[] cities = {"a", "b", "c", "C"};

    // Then: Should return 16
    assertEquals(16, solution.solution(cacheSize, cities));
  }

  @Test
  @DisplayName("test should return 25")
  public void test3() {
    // Given: Set input
    int cacheSize = 0;
    String[] cities = {"a", "b", "c", "d", "e"};

    // Then: Should return 25
    assertEquals(25, solution.solution(cacheSize, cities));
  }
}