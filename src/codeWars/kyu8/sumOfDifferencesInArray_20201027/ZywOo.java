package codeWars.kyu8.sumOfDifferencesInArray_20201027;

import java.util.Arrays;

public class ZywOo {

  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    return arr.length <= 1 ? 0 : arr[arr.length - 1] - arr[0];
  }
}
