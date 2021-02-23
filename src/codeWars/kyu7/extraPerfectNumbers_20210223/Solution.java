package codeWars.kyu7.extraPerfectNumbers_20210223;

import java.util.stream.IntStream;

public class Solution {

  public static int[] extraPerfect(int number) {
    return IntStream.rangeClosed(1, number)
        .mapToObj(Integer::toBinaryString)
        .filter(x -> x.charAt(0) == '1' && x.charAt(x.length() - 1) == '1')
        .mapToInt(x -> Integer.parseInt(x, 2))
        .toArray();
  }
}
