package codeWars.kyu7.sumOfOddCubedNumbers_20201019;

import java.util.Arrays;

public class FindOddCubes {

  public static int cubeOdd(int[] arr) {
    return Arrays.stream(arr).filter(x -> Math.abs(x) % 2 == 1).map(x -> x * x * x).sum();
  }
}
