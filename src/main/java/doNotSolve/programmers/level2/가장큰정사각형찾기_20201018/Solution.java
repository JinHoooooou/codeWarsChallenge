package doNotSolve.programmers.level2.가장큰정사각형찾기_20201018;

import java.util.Arrays;

public class Solution {

  public int solution(int[][] board) {
    int maxLength = Arrays.stream(buildBoard(board)).flatMapToInt(Arrays::stream).max().orElse(0);
    return maxLength * maxLength;
  }

  private int[][] buildBoard(int[][] board) {
    int[][] maxLengthBoard = Arrays.stream(board).map(int[]::clone)
        .toArray(int[][]::new);
    for (int i = 1; i < maxLengthBoard.length; i++) {
      for (int j = 1; j < maxLengthBoard[i].length; j++) {
        if (maxLengthBoard[i][j] == 1) {
          maxLengthBoard[i][j] = 1 + Math.min(maxLengthBoard[i - 1][j - 1],
              Math.min(maxLengthBoard[i - 1][j], maxLengthBoard[i][j - 1]));
        }
      }
    }
    return maxLengthBoard;
  }
}
