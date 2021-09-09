package doNotSolve.programmers.level2.프렌즈블록;

public class Solution {

  public int solution(int m, int n, String[] board) {
    String[][] table = buildTable(m, n, board);
    int count = 0;

    while (true) {
      int dropBlockCount = countFourBlock(m, n, table);
      if (dropBlockCount == 0) {
        break;
      }
      count += dropBlockCount;
      dropTable(m, n, table);
    }

    return count;
  }

  private String[][] buildTable(int m, int n, String[] board) {
    String[][] table = new String[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        table[i][j] = board[i].charAt(j) + "";
      }
    }
    return table;
  }

  private int countFourBlock(int m, int n, String[][] table) {

    boolean[][] check = new boolean[m][n];

    for (int row = 0; row < m - 1; row++) {
      for (int col = 0; col < n - 1; col++) {
        if (table[row][col].equals(".")) {
          continue;
        }
        checkFourBlock(table, check, row, col);
      }
    }

    int count = 0;
    for (int row = 0; row < m; row++) {
      for (int col = 0; col < n; col++) {
        if (check[row][col]) {
          count++;
          table[row][col] = ".";
        }
      }
    }

    return count;
  }

  private void checkFourBlock(String[][] table, boolean[][] check, int currentRow,
      int currentCol) {
    String currentBlock = table[currentRow][currentCol];

    for (int row = currentRow; row < currentRow + 2; row++) {
      for (int col = currentCol; col < currentCol + 2; col++) {
        if (!table[row][col].equals(currentBlock)) {
          return;
        }
      }
    }

    for (int row = currentRow; row < currentRow + 2; row++) {
      for (int col = currentCol; col < currentCol + 2; col++) {
        check[row][col] = true;
      }
    }
  }

  private void dropTable(int m, int n, String[][] table) {
    for (int col = 0; col < n; col++) {
      for (int row = m - 1; row >= 0; row--) {
        if (table[row][col].equals(".")) {
          for (int notDotRow = row - 1; notDotRow >= 0; notDotRow--) {
            if (!table[notDotRow][col].equals(".")) {
              table[row][col] = table[notDotRow][col];
              table[notDotRow][col] = ".";
              break;
            }
          }
        }
      }
    }
  }

}
