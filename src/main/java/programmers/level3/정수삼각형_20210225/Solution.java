package programmers.level3.정수삼각형_20210225;

import java.util.Arrays;

public class Solution {

  public int solution(int[][] triangle) {
    int[][] maxSums = init(triangle);
    for (int row = 1; row < triangle.length; row++) {
      fillFirstAndLast(maxSums, triangle, row);
      for (int j = 1; j < maxSums[row].length - 1; j++) {
        maxSums[row][j] = Math.max(maxSums[row - 1][j - 1], maxSums[row - 1][j])
            + triangle[row][j];
      }
    }
    return Arrays.stream(maxSums[maxSums.length - 1]).max().getAsInt();
  }

  private void fillFirstAndLast(int[][] maxSums, int[][] triangle, int row) {
    int first = 0;
    int last = maxSums[row].length - 1;

    maxSums[row][first] = maxSums[row - 1][first] + triangle[row][first];
    maxSums[row][last] = maxSums[row - 1][last - 1] + triangle[row][last];
  }

  private int[][] init(int[][] triangle) {
    int[][] result = new int[triangle.length][];
    for (int i = 0; i < triangle.length; i++) {
      result[i] = new int[triangle[i].length];
    }
    result[0][0] = triangle[0][0];

    return result;
  }
}
