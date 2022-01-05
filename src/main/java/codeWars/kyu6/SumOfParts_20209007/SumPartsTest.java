package codeWars.kyu6.SumOfParts_20209007;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SumPartsTest {

  @Test
  public void testWhenInputLength0() {
    assertArrayEquals(new int[]{0}, SumParts.sumParts(new int[]{}));
  }

  @Test
  public void testWhenInputLength1() {
    assertArrayEquals(new int[]{1, 0}, SumParts.sumParts(new int[]{1}));
  }

  @Test
  public void testWhenInputIsComposedOfLargeNumber() {
    int[] input = {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358};
    int[] expected = {10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270,
        2581057, 2580168, 2579358, 0};

    assertArrayEquals(expected, SumParts.sumParts(input));
  }
}