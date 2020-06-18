package codeWars.kyu7.maximumLengthDifference_20200618;

import java.util.Arrays;

public class MaxDiffLength {

  public static int maxdiflg(String[] a1, String[] a2) {
    if (a1.length == 0 || a2.length == 0) {
      return -1;
    }
    int a1Max = Arrays.stream(a1).mapToInt(String::length).max().getAsInt();
    int a1Min = Arrays.stream(a1).mapToInt(String::length).min().getAsInt();
    int a2Max = Arrays.stream(a2).mapToInt(String::length).max().getAsInt();
    int a2Min = Arrays.stream(a2).mapToInt(String::length).min().getAsInt();
    return Math.max(a1Max - a2Min, a2Max - a1Min);
  }
}
