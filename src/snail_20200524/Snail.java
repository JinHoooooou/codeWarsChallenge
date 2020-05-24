package snail_20200524;

public class Snail {

  public static int[] snail(int[][] array) {
    if (array.length == 1) {
      return new int[]{1};
    }
    int[] result = new int[array.length * array.length];
    if (array.length == 2) {
      int index = 0;
      for (int i = 0; i < array.length; i++) {
        result[index] = array[0][i];
        index++;
      }
      for (int i = 1; i < array.length; i++) {
        result[index] = array[i][array.length - 1];
        index++;
      }
      for (int i = 0; i >= 0; i--) {
        result[index] = array[array.length - 1][i];
        index++;
      }
    } else if (array.length == 3) {
      int index = 0;
      for (int i = 0; i < array.length; i++) {
        result[index] = array[0][i];
        index++;
      }
      for (int i = 1; i < array.length; i++) {
        result[index] = array[i][array.length - 1];
        index++;
      }
      for (int i = 1; i >= 0; i--) {
        result[index] = array[array.length - 1][i];
        index++;
      }
      for (int i = 0; i < 2; i++) {
        result[index] = array[1][i];
        index++;
      }
    }

    return result;
  }
}
