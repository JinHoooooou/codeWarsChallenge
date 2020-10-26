package programmers.level2.최댓값과최솟값_20201026;

import java.util.Arrays;

public class Solution {

  public String solution(String s) {
    int[] array = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(array);
    return array[0] + " " + array[array.length - 1];
  }
}
