package programmers.eatingGroundGame;

import java.util.Arrays;

public class Solution {

  public int solution(int[][] land) {
    for (int i = 1; i < land.length; i++) {
      for (int j = 0; j < land[0].length; j++) {
        int max = 0;
        for (int k = 0; k < land[0].length; k++) {
          if (k == j) {
            continue;
          }
          max = Math.max(max, land[i - 1][k]);
        }
        land[i][j] += max;
      }
    }

    Arrays.sort(land[land.length - 1]);
    return land[land.length - 1][land[0].length - 1];
  }
}
