package codeWars.kyu6.matrixAddition_20201004;

public class Kata {

  public static int[][] matrixAddition(int[][] a, int[][] b) {
    int[][] result = new int[a.length][a.length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        result[i][j] = a[i][j] + b[i][j];
      }
    }
    return result;
  }
}
