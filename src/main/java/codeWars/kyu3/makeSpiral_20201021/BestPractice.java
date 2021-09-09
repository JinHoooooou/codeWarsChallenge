package codeWars.kyu3.makeSpiral_20201021;

public class BestPractice {

  public static int[][] spiralize(int size) {
    int[][] spiral = new int[size][size];

    int minRow = 0;
    int maxRow = size - 1;
    int minCol = 0;
    int maxCol = size - 1;
    while (maxRow >= minRow) {
      for (int i = minCol; i <= maxCol; i++) {
        spiral[minRow][i] = 1;
      }
      for (int i = minRow; i <= maxRow; i++) {
        spiral[i][maxCol] = 1;
      }
      if (minCol != 0) {
        minCol += 1;
      }
      if (maxRow - 1 == minRow) {
        break;
      }

      for (int i = maxCol - 1; i >= minCol; i--) {
        spiral[maxRow][i] = 1;
      }
      for (int i = maxRow - 1; i >= minRow + 2; i--) {
        spiral[i][minCol] = 1;
      }

      minCol += 1;
      minRow += 2;
      maxCol -= 2;
      maxRow -= 2;
    }
    return spiral;
  }
}
