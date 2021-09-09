package programmers.level1.정수내림차순으로배치하기_20201025;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

  public long solution(long n) {
    String[] split = String.valueOf(n).split("");
    Arrays.sort(split, Comparator.reverseOrder());
    return Long.parseLong(String.join("", split));
  }
}
