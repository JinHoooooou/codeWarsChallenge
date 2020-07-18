package codeWars.kyu5.bestTravel_20200717;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumOfkTest {

  @Test
  @DisplayName("test should null when k > ls.length")
  public void test1() {
    // Given: Set input
    List<Integer> ls = new ArrayList<>(Arrays.asList(50));

    // Then: Should null
    assertNull(SumOfk.chooseBestSum(163, 3, ls));
  }

  @Test
  @DisplayName("test should 163 when limit=163, townsCount=3 and list")
  public void test2() {
    // Given: Set input
    List<Integer> ls = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));

    // Then: Should null
    assertEquals(163, SumOfk.chooseBestSum(163, 3, ls));
  }

  @Test
  @DisplayName("test should 228 when limit=230, townsCount=3, and list")
  public void test3() {
    // Given: Set input
    List<Integer> ls = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));

    // Then: Should null
    assertEquals(228, SumOfk.chooseBestSum(230, 3, ls));
  }
}