package codeWars.kyu6.twoSun_20200614;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return [1,2] when numbers=[1,2,3], target=5")
  public void test1() {
    // Given: Set input
    int[] numbers = {1, 2, 3};
    int target = 5;

    // Then: Should return [1,2]
    assertArrayEquals(new int[]{1, 2}, Solution.twoSum(numbers, target));
  }
}