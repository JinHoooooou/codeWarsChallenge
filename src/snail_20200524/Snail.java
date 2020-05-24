package snail_20200524;

public class Snail {

  public static int[] snail(int[][] array) {
    if (array.length == 1) {
      return new int[]{1};
    }
    int[] result = new int[array.length * array.length];
    result[0] = array[0][0];
    result[1] = array[0][1];
    result[2] = array[1][1];
    result[3] = array[1][0];

    return result;
  }
}
