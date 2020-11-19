package codeWars.kyu7.lookingForBenefactor_20201119;

import java.util.Arrays;

public class NewAverage {

  public static long newAvg(double[] arr, double navg) {
    double baseSum = Arrays.stream(arr).sum();
    double result = navg * (arr.length + 1) - baseSum;

    if (result > 0) {
      return (long) Math.ceil(result);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
