package programmers.level2.삼각달팽이_20201012;

public class Solution {

  public int[] solution(int n) {
    int sumToN = n * (n + 1) / 2;
    int[] result = new int[sumToN];
    int[][] triSnail = new int[n][];
    for (int i = 0; i < n; i++) {
      triSnail[i] = new int[i + 1];
    }

    triSnail[0][0] = 1;
    int row = 0, col = 0;
    int downEdgeRow = triSnail.length - 1;
    int downEdgeCol = 0;
    int rightEdgeRow = triSnail.length - 1;
    int rightEdgeCol = triSnail.length - 1;
    int diagonalEdgeRow = 1;
    int diagonalEdgeCol = 1;
    int direction = 0;
    for (int current = 1; current <= sumToN; current++) {
      triSnail[row][col] = current;
      if (direction == 2) {
        if (row == diagonalEdgeRow && col == diagonalEdgeCol) {
          direction = 0;
          diagonalEdgeRow += 2;
          diagonalEdgeCol += 1;
          row++;
        } else {
          row--;
          col--;
        }
      } else if (direction == 0) {
        if (row == downEdgeRow && col == downEdgeCol) {
          direction = 1;
          downEdgeRow -= 1;
          downEdgeCol += 1;
          col++;
        } else {
          row++;
        }
      } else if (direction == 1) {
        if (row == rightEdgeRow && col == rightEdgeCol) {
          direction = 2;
          rightEdgeRow -= 1;
          rightEdgeCol -= 2;
          row--;
          col--;
        } else {
          col++;
        }
      }
    }

    int index = 0;
    for (int i = 0; i < triSnail.length; i++) {
      for (int j = 0; j < triSnail[i].length; j++) {
        result[index++] = triSnail[i][j];
      }
    }

    return result;
  }
}
