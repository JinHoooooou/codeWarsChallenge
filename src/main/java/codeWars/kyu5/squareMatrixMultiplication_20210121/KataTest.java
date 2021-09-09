package codeWars.kyu5.squareMatrixMultiplication_20210121;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void testWhenInputIs2x2() {
    int[][] a = {
        {9, 7},
        {0, 1}
    };
    int[][] b = {
        {1, 1},
        {4, 12}
    };
    int[][] expected = {
        {37, 93},
        {4, 12}
    };

    assertThat(Kata.matrixMultiplication(a, b), is(expected));
  }

  @Test
  public void testWhenInputIs3x3() {
    int[][] a = {
        {1, 2, 3},
        {3, 2, 1},
        {2, 1, 3}
    };
    int[][] b = {
        {4, 5, 6},
        {6, 5, 4},
        {4, 6, 5}
    };
    int[][] expected = {
        {28, 33, 29},
        {28, 31, 31},
        {26, 33, 31}
    };

    assertThat(Kata.matrixMultiplication(a, b), is(expected));
  }
}