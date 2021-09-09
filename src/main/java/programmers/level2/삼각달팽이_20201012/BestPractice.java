package programmers.level2.삼각달팽이_20201012;

public class BestPractice {

  public int[] solution(int n) {
    int[] result = new int[n * (n + 1) / 2];
    int[][] triSnail = new int[n][n];
    int y = -1, x = 0;
    int current = 1;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (i % 3 == 0) {
          y++;
        } else if (i % 3 == 1) {
          x++;
        } else if (i % 3 == 2) {
          y--;
          x--;
        }
        triSnail[y][x] = current++;
      }
    }
    current = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < triSnail[i].length; j++) {
        if (triSnail[i][j] == 0) {
          break;
        }
        result[current++] = triSnail[i][j];
      }
    }
    return result;
  }
}
