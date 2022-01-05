package programmers.moreSpicy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 2 when k=7 scoville=[1,2,3,9,10,12]")
  public void test1() {
    // Given: Set input
    int[] scoville = {1, 2, 3, 9, 10, 12};

    // Then: Should return 2
    assertEquals(2, solution.solution(scoville, 7));
  }
}