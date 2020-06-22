package codeWars.kyu7.areTheNumbersInOrder_20200622;

import java.util.Arrays;

public class Solution {

  public static boolean isAscOrder(int[] arr) {
    int[] compare = Arrays.copyOf(arr, arr.length);
    Arrays.sort(compare);
    return Arrays.equals(arr, compare);
  }
}
