package codewars._7kyu.Consecutive_letters_20220222;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

  public static boolean solve(String s) {
    String sorted = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
    char target = sorted.charAt(0);
    for (int i = 1; i < sorted.length(); i++) {
      if (target + i != sorted.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}
