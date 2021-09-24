package codeWars.kyu7.Largest_pair_sum_in_array_20210924;

import java.util.Arrays;

public class Solution {

  public static int largestPairSum(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length - 1] + numbers[numbers.length - 2];
  }
}
