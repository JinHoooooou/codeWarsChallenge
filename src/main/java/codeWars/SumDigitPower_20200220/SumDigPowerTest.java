package codeWars.SumDigitPower_20200220;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SumDigPowerTest {

  private static void testing(long a, long b, long[] res) {
    assertEquals(Arrays.toString(res), Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
  }

  // 89 8^1 + 9^2  81 + 8
  // 0~9 == 0 1 2 3 4 5 6
  // 10 != 1^1 + 0^2
  @Test
  void shouldReturn0With0To0() {
    testing(0, 0, new long[]{0});
  }

  @Test
  void shouldReturn0To1With0To1() {
    testing(0, 1, new long[]{0, 1});
  }

  @Test
  void shouldReturn0To9With0To10() {
    testing(0, 10, new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
  }

  @Test
  void shouldReturn0To9And89With0To100() {
    testing(0, 100, new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
  }
}