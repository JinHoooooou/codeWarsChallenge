package codeWars.kyu7.minimizeSumOfArray_20201119;

import java.util.Arrays;

public class Solution {

  public static int minSum(int[] passed) {
    Arrays.sort(passed);
    int result = 0;
    for (int i = 0; i < passed.length / 2; i++) {
      result += (passed[i] * passed[passed.length - 1 - i]);
    }
    return result;
  }
}
