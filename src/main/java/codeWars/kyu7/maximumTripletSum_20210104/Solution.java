package codeWars.kyu7.maximumTripletSum_20210104;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

  public static int maxTriSum(int[] numbers) {
    return Arrays.stream(numbers)
        .distinct()
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(x -> x)
        .limit(3)
        .sum();
  }
}
