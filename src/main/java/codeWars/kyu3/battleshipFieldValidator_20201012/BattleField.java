package codeWars.kyu3.battleshipFieldValidator_20201012;

public class BattleField {

  private static boolean[][] visit;
  static int battleShip = 0;
  static int cruiser = 0;
  static int destroyer = 0;
  static int submarine = 0;

  public static boolean fieldValidator(int[][] field) {
    if (!checkAdjacent(field)) {
      return false;
    }
    visit = new boolean[field.length][field.length];
    battleShip = 0;
    cruiser = 0;
    destroyer = 0;
    submarine = 0;

    countShip(field);

    return battleShip == 1 && cruiser == 2 && destroyer == 3 && submarine == 4;
  }

  private static void countShip(int[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        int ship = dfs(field, i, j, 0);
        if (ship == 4) {
          battleShip++;
        } else if (ship == 3) {
          cruiser++;
        } else if (ship == 2) {
          destroyer++;
        } else if (ship == 1) {
          submarine++;
        }
      }
    }
  }

  private static boolean checkAdjacent(int[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++) {
        if (field[i][j] == 1) {
          if (isMultiAdjacent(field, i, j) || isEdgeAdjacent(field, i, j)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  private static int dfs(int[][] field, int i, int j, int length) {
    if (i < 0 || i >= field.length) {
      return 0;
    }
    if (j < 0 || j >= field.length) {
      return 0;
    }
    if (visit[i][j]) {
      return 0;
    }

    visit[i][j] = true;
    if (field[i][j] == 0) {
      return 0;
    }
    return 1 + dfs(field, i, j - 1, length + 1) + dfs(field, i, j + 1, length + 1)
        + dfs(field, i - 1, j, length + 1) + dfs(field, i + 1, j, length + 1);
  }

  private static boolean isEdgeAdjacent(int[][] field, int i, int j) {
    if (i - 1 >= 0 && j - 1 >= 0 && field[i - 1][j - 1] == 1) {
      return true;
    }
    if (i - 1 >= 0 && j + 1 < field.length && field[i - 1][j + 1] == 1) {
      return true;
    }
    if (i + 1 < field.length && j - 1 >= 0 && field[i + 1][j - 1] == 1) {
      return true;
    }
    if (i + 1 < field.length && j + 1 < field.length && field[i + 1][j + 1] == 1) {
      return true;
    }
    return false;
  }

  private static boolean isMultiAdjacent(int[][] field, int i, int j) {
    //상 and 좌우
    if (i - 1 >= 0 && j - 1 >= 0 && j + 1 < field.length
        && field[i - 1][j] == 1 && (field[i][j - 1] == 1 || field[i][j + 1] == 1)) {
      return true;
    }

    //하 and 좌우
    if (i + 1 < field.length && j - 1 >= 0 && j + 1 < field.length
        && field[i + 1][j] == 1 && (field[i][j - 1] == 1 || field[i][j + 1] == 1)) {
      return true;
    }

    //좌 and 상하
    if (j - 1 >= 0 && i - 1 >= 0 && i + 1 < field.length
        && field[i][j - 1] == 1 && (field[i - 1][j] == 1 || field[i + 1][j] == 1)) {
      return true;
    }

    //우 and 상하
    if (j + 1 < field.length && i - 1 >= 0 && i + 1 < field.length
        && field[i][j + 1] == 1 && (field[i - 1][j] == 1 || field[i + 1][j] == 1)) {
      return true;
    }

    return false;
  }


}
