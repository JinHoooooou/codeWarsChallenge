package programmers.level1.예산_20201111;

import java.util.Arrays;

public class Solution {

  public int solution(int[] d, int budget) {
    int count = 0;
    Arrays.sort(d);
    for (int i = 0; i < d.length; i++) {
      if (budget >= d[i]) {
        budget -= d[i];
        count++;
      }
    }
    return count;
  }
}
