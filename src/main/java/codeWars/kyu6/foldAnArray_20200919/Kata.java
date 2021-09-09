package codeWars.kyu6.foldAnArray_20200919;

import java.util.Arrays;

public class Kata {

  public static int[] foldArray(int[] array, int runs) {
    if (array.length == 0) {
      return new int[]{};
    }
    int[] result = Arrays.copyOf(array, array.length);
    int[] copy = Arrays.copyOf(array, array.length);
    for (int i = 0; i < runs; i++) {
      int foldIndex = (int) Math.ceil(copy.length / 2.0);
      result = Arrays.copyOf(copy, foldIndex);
      for (int j = copy.length - 1, k = 0; j >= foldIndex; j--, k++) {
        result[k] += copy[j];
      }
      if (result.length == 1) {
        break;
      }
      copy = Arrays.copyOf(result, result.length);
    }
    return result;
  }
}
