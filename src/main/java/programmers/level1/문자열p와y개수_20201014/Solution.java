package programmers.level1.문자열p와y개수_20201014;

import java.util.Arrays;

public class Solution {

  public static boolean solution(String s) {
    long pCount = Arrays.stream(s.toLowerCase().split("")).filter(p -> p.equals("p")).count();
    long yCount = Arrays.stream(s.toLowerCase().split("")).filter(y -> y.equals("y")).count();
    return pCount == yCount;
  }
}
