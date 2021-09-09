package codeWars.kyu7.productOfMaximumOfArray_20201130;

import java.util.Arrays;

public class Solution {

  public static long maxProduct(int[] numbers, int sub_size) {
    Arrays.sort(numbers);

    long result = 1;
    for (int i = numbers.length - 1; i > numbers.length - 1 - sub_size; i--) {
      result *= numbers[i];
    }
    return result;
  }
}
