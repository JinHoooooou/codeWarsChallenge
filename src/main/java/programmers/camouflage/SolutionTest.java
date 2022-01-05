package programmers.camouflage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 5")
  public void test1() {
    // Given: Set input
    String[][] clothes = {
        {"yellow_hat", "headgear"},
        {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}};

    // Then: Should return 5
    assertEquals(5, solution.solution(clothes));
  }

  @Test
  @DisplayName("test should return 3")
  public void test2() {
    // Given: Set input
    String[][] clothes = {
        {"crow_mask", "face"},
        {"blue_sunglasses", "face"},
        {"smoky_makeup", "face"}};

    // Then: Should return 3
    assertEquals(3, solution.solution(clothes));
  }
}