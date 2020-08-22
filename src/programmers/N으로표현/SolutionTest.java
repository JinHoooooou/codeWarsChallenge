package programmers.N으로표현;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();
  AnotherSolution anotherSolution = new AnotherSolution();

  @Test
  @DisplayName("test should return 4 when N=5, number=12")
  public void test1() {
    assertEquals(4, anotherSolution.solution(5, 12));
  }
}