package programmers.level1.나누어떨어지숫자배열_20201010;

import java.util.Arrays;

public class Solution {

  public static int[] solution(int[] arr, int divisor) {
    int[] result = Arrays.stream(arr).filter(x -> x % divisor == 0).sorted().toArray();
    return result.length == 0 ? new int[]{-1} : result;
  }
}
