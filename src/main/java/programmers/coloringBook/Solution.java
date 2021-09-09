package programmers.coloringBook;

public class Solution {

  boolean[][] visit;

  public int[] solution(int m, int n, int[][] picture) {
    visit = new boolean[m][n];
    int areaCount = 0;
    int maxArea = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (!visit[i][j] && picture[i][j] != 0) {
          areaCount++;
          maxArea = Math.max(maxArea, search(picture, i, j, picture[i][j]));
        }
      }
    }
    return new int[]{areaCount, maxArea};
  }

  private int search(int[][] picture, int i, int j, int value) {
    if (j < 0 || j >= picture[0].length) {
      return 0;
    }
    if (i < 0 || i >= picture.length) {
      return 0;
    }
    if (!visit[i][j] && picture[i][j] == value) {
      visit[i][j] = true;
      return 1
          + search(picture, i - 1, j, value)
          + search(picture, i, j + 1, value)
          + search(picture, i + 1, j, value)
          + search(picture, i, j - 1, value);
    }
    return 0;
  }
}
