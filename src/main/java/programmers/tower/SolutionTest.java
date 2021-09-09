package programmers.tower;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return [0,1] when input [9,5]")
  public void test1() {
    // Given: Set input
    int[] towersHeight = {9, 5};

    // Then: Should return [0,1]
    assertArrayEquals(new int[]{0, 1}, solution.solution(towersHeight));
  }

  @Test
  @DisplayName("test should return [0,0,2,2,4] when input [6,9,5,7,4]")
  public void test2() {
    // Given: Set input
    int[] towersHeight = {6, 9, 5, 7, 4};

    // Then: Should return [0,0,2,2,4]
    assertArrayEquals(new int[]{0, 0, 2, 2, 4}, solution.solution(towersHeight));
  }

  @Test
  @DisplayName("test should return [0,0,0,3,3,3,6] when input [3,9,9,3,5,7,2]")
  public void test3() {
    // Given: Set input
    int[] towersHeight = {3, 9, 9, 3, 5, 7, 2};

    // Then: Should return [0,0,0,3,3,3,6]
    assertArrayEquals(new int[]{0, 0, 0, 3, 3, 3, 6}, solution.solution(towersHeight));
  }
}