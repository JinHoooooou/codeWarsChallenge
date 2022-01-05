package programmers.travelPath;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    // Given: Set input
    String[][] tickets = {
        {"ICN", "JFK"},
        {"HND", "IAD"},
        {"JFK", "HND"}
    };

    assertArrayEquals(new String[]{"ICN", "JFK", "HND", "IAD"}, solution.solution(tickets));
  }

  @Test
  public void test2() {
    // Given: Set input
    String[][] tickets = {
        {"ICN", "SFO"},
        {"ICN", "ATL"},
        {"SFO", "ATL"},
        {"ATL", "ICN"},
        {"ATL", "SFO"}
    };

    assertArrayEquals(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"},
        solution.solution(tickets));
  }
}