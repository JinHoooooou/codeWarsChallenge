package programmers.expectedTournament;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 3 when n=8, a=4, b=7")
  public void test1() {
    assertEquals(3, solution.solution(8, 4, 7));
  }
}