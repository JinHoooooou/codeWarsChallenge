package programmers.level1.하샤드수_20201029;

import java.util.Arrays;

public class Solution {

  public boolean solution(int x) {
    int sumOfDigits =
        Arrays.stream(String.valueOf(x).split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    return x % sumOfDigits == 0;
  }
}
