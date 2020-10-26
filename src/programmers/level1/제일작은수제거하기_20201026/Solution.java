package programmers.level1.제일작은수제거하기_20201026;

import java.util.Arrays;

public class Solution {

  public static int[] solution(int[] arr) {
    if (arr.length == 1) {
      return new int[]{-1};
    }
    int min = Arrays.stream(arr).min().orElse(0);
    return Arrays.stream(arr).filter(x -> x != min).toArray();
  }
}
