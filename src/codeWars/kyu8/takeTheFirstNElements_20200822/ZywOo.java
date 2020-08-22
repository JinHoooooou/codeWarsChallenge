package codeWars.kyu8.takeTheFirstNElements_20200822;

import java.util.Arrays;

public class ZywOo {

  public static int[] take(int[] arr, int n) {
    return Arrays.copyOfRange(arr, 0, Math.min(n, arr.length));
  }

}
