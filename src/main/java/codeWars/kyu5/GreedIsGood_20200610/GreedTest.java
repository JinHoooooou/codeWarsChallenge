package codeWars.kyu5.GreedIsGood_20200610;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreedTest {

  @Test
  @DisplayName("test should return 250 when input [5,1,3,4,1]")
  public void test1() {
    // Given: Set input
    int[] dice = {5, 1, 3, 4, 1};

    // Then: Should return 250 => two 1 = 100 * 2, one 5 = 50 => 100*2 + 50 = 250
    assertEquals(250, Greed.greedy(dice));
  }

  @Test
  @DisplayName("test should return 1100 when input [1,1,1,3,1]")
  public void test2() {
    // Given: Set input
    int[] dice = {1, 1, 1, 3, 1};

    // Then: Should return 1000 => three 1 = 1000, one 1 = 100 => 1100
    assertEquals(1100, Greed.greedy(dice));
  }

  @Test
  @DisplayName("test should return 450 when input [2,4,4,5,4]")
  public void test3() {
    // Given: Set input
    int[] dice = {2, 4, 4, 5, 4};

    // Then: Should return 450 => three 4 = 400, one 5 = 50 => 450
    assertEquals(450, Greed.greedy(dice));
  }
}