package codeWars.kyu4.sumByFactors_20200714;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumOfDividedTest {

  @Test
  @DisplayName("test should return (2 12)(3 27)(5 15) when input [12,15]")
  public void test1() {
    assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(new int[]{12, 15}));
  }

  @Test
  @DisplayName("test should return (2 54)(3 135)(5 90)(7 21) when input [15, 21, 24, 30, 45]")
  public void test2() {
    int[] list = {15, 21, 24, 30, 45};

    String expected = "(2 54)(3 135)(5 90)(7 21)";
    assertEquals(expected, SumOfDivided.sumOfDivided(list));
  }

  @Test
  @DisplayName("test should return (2 54)(3 135)(5 90)(7 21) when input [15, 21, 24, 30, 45]")
  public void test3() {
    int[] list = {15, 21, 24, 30, 45};

    String expected = "(2 54)(3 135)(5 90)(7 21)";
    assertEquals(expected, SumOfDivided.sumOfDivided(list));
  }

  @Test
  @DisplayName("test when input [-29804, -4209, -28265, -72769, -31744]")
  public void test4() {
    int[] list = {-29804, -4209, -28265, -72769, -31744};

    String expected = "(2 -61548)(3 -4209)(5 -28265)(23 -4209)(31 -31744)(53 -72769)(61 -4209)(1373 -72769)(5653 -28265)(7451 -29804)";
    assertEquals(expected, SumOfDivided.sumOfDivided(list));
  }

  @Test
  public void test10() {
    int[] list = {301, 295, -16, 87, 45, -7, 296, 3, 449, 296, 139, 94, 297, 155, 263, 137, 379,
        -29, 149, 327};

    String expected = "(2 670)(3 759)(5 495)(7 294)(11 297)(29 58)(31 155)(37 592)(43 301)(47 94)(59 295)(109 327)(137 137)(139 139)(149 149)(263 263)(379 379)(449 449)";
    assertEquals(expected, SumOfDivided.sumOfDivided(list));
  }
}