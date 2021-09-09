package programmers.level3.정수삼각형_20210225;

import java.util.Arrays;

public class BestAnswer {

  public static int solution(int[][] triangle) {
    for (int row = 1; row < triangle.length; row++) {
      triangle[row][0] += triangle[row - 1][0];
      triangle[row][row] += triangle[row - 1][row - 1];
      for (int col = 1; col < row; col++) {
        triangle[row][col] += Math.max(triangle[row - 1][col], triangle[row - 1][col - 1]);
      }
    }
    return Arrays.stream(triangle[triangle.length - 1]).max().getAsInt();
  }
}
