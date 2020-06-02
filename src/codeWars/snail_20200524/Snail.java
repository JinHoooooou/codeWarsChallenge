package codeWars.snail_20200524;

public class Snail {

  public static int[] snail(int[][] array) {
    if (array[0].length == 0) {
      return new int[0];
    }
    int[] result = new int[array.length * array.length];
    int index = 0;
    for (int i = 0; i < array.length / 2; i++) {
      for (int j = i; j < array.length - i; j++) {
        result[index] = array[i][j];
        index++;
      }
      for (int j = i + 1; j < array.length - i; j++) {
        result[index] = array[j][array.length - 1 - i];
        index++;
      }
      for (int j = array.length - 2 - i; j >= i; j--) {
        result[index] = array[array.length - 1 - i][j];
        index++;
      }
      for (int j = array.length - 2 - i; j >= i + 1; j--) {
        result[index] = array[j][i];
        index++;
      }
    }

    if (array.length % 2 == 1) {
      result[index] = array[array.length / 2][array.length / 2];
    }
    return result;
  }
}
