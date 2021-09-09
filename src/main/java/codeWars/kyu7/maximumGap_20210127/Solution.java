package codeWars.kyu7.maximumGap_20210127;

import java.util.Arrays;

public class Solution {

  public static int maxGap(int[] numbers) {
    Arrays.sort(numbers);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length - 1; i++) {
      max = Math.max(numbers[i + 1] - numbers[i], max);
    }
    return max;
  }
}
