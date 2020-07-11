package programmers.savingBoat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 3 when people=[70,50,80,50], limit=100")
  public void test1() {
    // Given: Set input
    int[] people = {70, 50, 80, 50};
    int limit = 100;

    // Then: Should return 3
    assertEquals(3, solution.solution(people, limit));
  }
}