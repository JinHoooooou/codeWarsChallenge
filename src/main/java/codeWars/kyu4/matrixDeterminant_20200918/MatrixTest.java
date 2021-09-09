package codeWars.kyu4.matrixDeterminant_20200918;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

  @Test
  public void testWhenMatrixSize1() {
    int[][] matrix = {
        {2}
    };

    assertEquals(2, Matrix.determinant(matrix));
  }

  @Test
  public void testWhenMatrixSize2() {
    int[][] matrix = {
        {1, 3},
        {2, 5}
    };

    assertEquals(-1, Matrix.determinant(matrix));
  }

  @Test
  public void testWhenMatrixSize3() {
    int[][] matrix = {
        {2, 5, 3},
        {1, -2, -1},
        {1, 3, 4}
    };

    assertEquals(-20, Matrix.determinant(matrix));
  }

  @Test
  public void testWhenMatrixSize4() {
    int[][] matrix = {
        {5, 2, 8, 4},
        {5, 11, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    assertEquals(220, Matrix.determinant(matrix));
  }
}