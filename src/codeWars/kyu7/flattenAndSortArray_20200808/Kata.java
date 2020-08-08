package codeWars.kyu7.flattenAndSortArray_20200808;

import java.util.Arrays;

public class Kata {

  public static int[] flattenAndSort(int[][] array) {
    int[] flatten = getFlattenArray(array);
    Arrays.sort(flatten);
    return flatten;
  }

  private static int[] getFlattenArray(int[][] array) {
    return Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
  }
}
