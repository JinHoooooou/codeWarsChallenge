package codeWars.kyu6.foldAnArray_20200919;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KataBestPractice {

  public static int[] foldArray(int[] array, int runs) {
    int[] result = Arrays.copyOf(array, (int) Math.ceil(array.length / 2.0));
    IntStream.range(0, array.length / 2)
        .forEach(i -> result[i] = array[i] + array[array.length - 1 - i]);
    return runs > 1 ? foldArray(result, runs - 1) : result;
  }
}
