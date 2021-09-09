package codeWars.kyu7.formTheMinimum_20200711;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MinimumAnotherSolution {

  public static int minValue(int[] values) {
    String toString = Arrays.stream(values)
        .distinct()
        .sorted()
        .mapToObj(String::valueOf)
        .collect(Collectors.joining());

    return Integer.parseInt(toString);
  }
}
