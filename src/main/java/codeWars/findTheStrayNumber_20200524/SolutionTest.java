package codeWars.findTheStrayNumber_20200524;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return 2 when input [1,1,2]")
  public void test() {
    // Given: Set int array
    int[] given = {1, 1, 2};

    // Then: should return 2
    assertEquals(2, Solution.stray(given));
  }
}