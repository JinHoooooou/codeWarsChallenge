package codeWars.kyu7.nthPowerRulesThemAll_20201222;

import java.util.Arrays;

public class Kata {

  public static int modifiedSum(int[] array, int power) {
    return Arrays.stream(array).map(x -> (int) Math.pow(x, power) - x).sum();
  }
}
