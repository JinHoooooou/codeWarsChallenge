package codeWars.kyu8.mergingSortedIntegerArrays_20210211;

import java.util.stream.IntStream;

public class Kata {

  public static int[] mergeArrays(int[] first, int[] second) {
    return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted()
        .toArray();
  }
}
