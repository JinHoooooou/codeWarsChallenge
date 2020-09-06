package programmers.자물쇠와열쇠;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testWhenKeyLength3LockLength3() {
    int[][] key = {
        {0, 0, 0},
        {1, 0, 0},
        {0, 1, 1}
    };
    int[][] lock = {
        {1, 1, 1},
        {1, 1, 0},
        {1, 0, 1}
    };

    assertTrue(new Solution().solution(key, lock));
  }
}