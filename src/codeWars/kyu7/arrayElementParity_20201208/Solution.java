package codeWars.kyu7.arrayElementParity_20201208;

import java.util.Arrays;

public class Solution {

  public static int solve(int[] arr) {
    return Arrays.stream(arr).distinct().sum();
  }
}
