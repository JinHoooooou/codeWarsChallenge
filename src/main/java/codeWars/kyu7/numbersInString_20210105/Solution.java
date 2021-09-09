package codeWars.kyu7.numbersInString_20210105;

import java.util.Arrays;

public class Solution {

  public static int solve(String s) {
    String[] split = s.split("[a-z]+");
    return Arrays.stream(s.split("[a-z]+"))
        .filter(x -> !x.isEmpty())
        .mapToInt(Integer::parseInt)
        .max()
        .getAsInt();
  }
}
