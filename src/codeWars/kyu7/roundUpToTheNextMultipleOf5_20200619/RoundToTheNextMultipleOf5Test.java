package codeWars.kyu7.roundUpToTheNextMultipleOf5_20200619;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RoundToTheNextMultipleOf5Test {

  @Test
  @DisplayName("test should return 0 when input -4~0")
  public void test1() {
    // Then: Should return 0
    assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(0));
    assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(-1));
    assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(-2));
    assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(-3));
    assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(-4));
  }

  @Test
  @DisplayName("test should return 5 when input 1~5")
  public void test2() {
    // Then: Should return 5
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(1));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(2));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(3));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(4));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(5));
  }

  @Test
  @DisplayName("test should return 10 when input 6~10")
  public void test3() {
    // Then: Should return 10
    assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(6));
    assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(7));
    assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(8));
    assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(9));
    assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(10));
  }

  @Test
  @DisplayName("test should return 3425 when input 3421")
  public void test4() {
    // Then: Should return 3425
    assertEquals(3425, RoundToTheNextMultipleOf5.roundToNext5(3421));
  }
}