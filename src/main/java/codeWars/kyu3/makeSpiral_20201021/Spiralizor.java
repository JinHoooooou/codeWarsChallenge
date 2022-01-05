package codeWars.kyu3.makeSpiral_20201021;

public class Spiralizor {

  static final int WALL = 1;
  static final int ROUTE = 0;
  static final int UNKNOWN = -1;

  static final int RIGHT = 0;
  static final int DOWN = 1;
  static final int LEFT = 2;
  static final int UP = 3;

  public static int[][] spiralize(int size) {

    int[][] spiral = initSpiral(size);
    makeBorder(spiral);

    int currentRow = 0;
    int currentCol = 0;
    spiral[currentRow][currentCol] = ROUTE;
    int direction = RIGHT;
    while (!isTail(spiral, currentRow, currentCol)) {
      if (direction == RIGHT) {
        spiral[currentRow][currentCol] = ROUTE;
        if (currentCol + 1 >= size || spiral[currentRow][currentCol + 1] == WALL) {
          direction = DOWN;
          currentRow++;
          continue;
        }
        if (currentRow - 1 >= 0) {
          spiral[currentRow - 1][currentCol] = WALL;
        }
        if (currentCol + 1 < size) {
          spiral[currentRow + 1][currentCol] = WALL;
        }
        currentCol++;
      } else if (direction == DOWN) {
        spiral[currentRow][currentCol] = ROUTE;
        if (currentRow + 1 >= size || spiral[currentRow + 1][currentCol] == WALL) {
          direction = LEFT;
          currentCol--;
          continue;
        }
        if (currentCol - 1 >= 0) {
          spiral[currentRow][currentCol - 1] = WALL;
        }
        if (currentCol + 1 < size) {
          spiral[currentRow][currentCol + 1] = WALL;
        }
        currentRow++;
      } else if (direction == LEFT) {
        spiral[currentRow][currentCol] = ROUTE;
        if (currentCol - 1 < 0 || spiral[currentRow][currentCol - 1] == WALL) {
          direction = UP;
          currentRow--;
          continue;
        }
        if (currentRow - 1 >= 0) {
          spiral[currentRow - 1][currentCol] = WALL;
        }
        if (currentRow + 1 < size) {
          spiral[currentRow + 1][currentCol] = WALL;
        }
        currentCol--;
      } else if (direction == UP) {
        spiral[currentRow][currentCol] = ROUTE;
        if (currentRow - 1 < 0 || spiral[currentRow - 1][currentCol] == WALL) {
          direction = RIGHT;
          currentCol++;
          continue;
        }
        if (currentCol - 1 >= 0) {
          spiral[currentRow][currentCol - 1] = WALL;
        }
        if (currentCol + 1 < size) {
          spiral[currentRow][currentCol + 1] = WALL;
        }
        currentRow--;
      }
    }
    spiral[currentRow][currentCol] = ROUTE;

    exchangeZeroWithOne(size, spiral);
    return spiral;
  }

  private static void exchangeZeroWithOne(int size, int[][] spiral) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (spiral[i][j] == WALL) {
          spiral[i][j] = ROUTE;
        } else if (spiral[i][j] == ROUTE) {
          spiral[i][j] = WALL;
        }
      }
    }
  }

  private static int[][] initSpiral(int size) {
    int[][] spiral = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        spiral[i][j] = UNKNOWN;
      }
    }
    return spiral;
  }

  private static void makeBorder(int[][] spiral) {
    for (int i = 0; i < spiral.length; i++) {
      spiral[i][0] = ROUTE;
      spiral[i][spiral.length - 1] = ROUTE;
      spiral[0][i] = ROUTE;
      spiral[spiral.length - 1][i] = ROUTE;
    }
    spiral[1][0] = WALL;
  }

  private static boolean isTail(int[][] spiral, int currentRow, int currentCol) {
    return (currentRow - 1 >= 0 && currentRow + 1 < spiral.length)
        && (currentCol - 1 >= 0 && currentCol + 1 < spiral.length)
        && (spiral[currentRow - 1][currentCol]
        + spiral[currentRow + 1][currentCol]
        + spiral[currentRow][currentCol - 1]
        + spiral[currentRow][currentCol + 1] == 3);
  }
}
