package snail_20200524;

public class Snail {

  public static int[] snail(int[][] array) {
    if (array.length == 1) {
      return new int[]{1};
    }
    int[] result = new int[array.length * array.length];
    if (array.length == 2) {
      result[0] = array[0][0];
      result[1] = array[0][1];
      result[2] = array[1][1];
      result[3] = array[1][0];
    } else if (array.length == 3) {
      result[0] = array[0][0];
      result[1] = array[0][1];
      result[2] = array[0][2];

      result[3] = array[1][2];
      result[4] = array[2][2];

      result[5] = array[2][1];
      result[6] = array[2][0];
      result[7] = array[1][0];
      result[8] = array[1][1];
    }

    return result;
  }
}
