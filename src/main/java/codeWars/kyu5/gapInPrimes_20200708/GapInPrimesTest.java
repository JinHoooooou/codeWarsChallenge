package codeWars.kyu5.gapInPrimes_20200708;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GapInPrimesTest {

  @Test
  @DisplayName("test should return [101, 103] when g=2, m=100, n=110")
  public void test1() {
    assertArrayEquals(new long[]{101, 103}, GapInPrimes.gap(2, 100, 110));
  }

  @Test
  @DisplayName("test should return [103, 107] when g=4, m=100, n=110")
  public void test2() {
    assertArrayEquals(new long[]{103, 107}, GapInPrimes.gap(4, 100, 110));
  }

  @Test
  @DisplayName("test should return null when g=6, m=100, n=110")
  public void test3() {
    assertNull(GapInPrimes.gap(6, 100, 110));
  }

  @Test
  @DisplayName("test should return [359, 367]when g=8, m=300, n=400")
  public void test4() {
    assertArrayEquals(new long[]{359, 367}, GapInPrimes.gap(8, 300, 400));
  }

  @Test
  @DisplayName("test should return [337, 347]when g=10, m=300, n=400")
  public void test5() {
    assertArrayEquals(new long[]{337, 347}, GapInPrimes.gap(10, 300, 400));
  }
}