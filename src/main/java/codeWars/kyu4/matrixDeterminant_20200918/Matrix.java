package codeWars.kyu4.matrixDeterminant_20200918;

import java.util.Arrays;

public class Matrix {

  public static int determinant(int[][] matrix) {
    if (matrix.length == 1) {
      return matrix[0][0];
    }
    if (matrix.length == 2) {
      return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    int[] subDeterminants = new int[matrix.length];
    int[][][] subMatrix = buildSubMatrix(matrix);

    for (int i = 0; i < matrix.length; i++) {
      subDeterminants[i] = (i % 2 == 0) ? matrix[0][i] * determinant(subMatrix[i])
          : -matrix[0][i] * determinant(subMatrix[i]);
    }

    return Arrays.stream(subDeterminants).sum();
  }

  private static int[][][] buildSubMatrix(int[][] matrix) {
    int[][][] subMatrix = new int[matrix.length][matrix.length - 1][matrix.length - 1];

    for (int i = 0; i < subMatrix.length; i++) {
      int target = matrix[0][i];
      int subRow = 0;
      int subCol = 0;
      for (int j = 1; j < matrix.length; j++) {
        for (int k = 0; k < matrix.length; k++) {
          if (k != i) {
            subMatrix[i][subRow][subCol] = matrix[j][k];
            subCol++;
            if (subCol >= subMatrix[i].length) {
              subCol = 0;
              subRow++;
            }
          }
        }
      }
    }
    return subMatrix;
  }

}
