package codeWars.kyu7.formTheLargest_20201006;

import java.util.Arrays;

public class Solution {

  public static long maxNumber(long n) {
    char[] result = String.valueOf(n).toCharArray();
    Arrays.sort(result);
    return Long.parseLong(new StringBuilder(String.valueOf(result)).reverse().toString());
  }
}
