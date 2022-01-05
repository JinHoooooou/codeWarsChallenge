package programmers.level2.쿼드압축후개수세기;

import java.util.Arrays;

public class Solution {

  int[] result;

  public int[] solution(int[][] arr) {
    result = new int[2];
    process(arr, 0, arr.length, 0, arr.length);
    return result;
  }

  private void process(int[][] arr, int rowStart, int rowEnd, int colStart, int colEnd) {
    int length = rowEnd - rowStart;
    int[][] dividedArray = divide(arr, length, rowStart, colStart, colEnd);

    if (dividedArray.length == 1) {
      result[dividedArray[0][0]]++;
      return;
    }

    long one = Arrays.stream(dividedArray).flatMapToInt(Arrays::stream).filter(o -> o == 1).count();
    long zero = Arrays.stream(dividedArray).flatMapToInt(Arrays::stream).filter(z -> z == 0)
        .count();

    if (one == length * length) {
      result[1]++;
    } else if (zero == length * length) {
      result[0]++;
    } else {
      process(dividedArray, 0, length / 2, 0, length / 2);
      process(dividedArray, 0, length / 2, length / 2, length);
      process(dividedArray, length / 2, length, 0, length / 2);
      process(dividedArray, length / 2, length, length / 2, length);

    }
  }

  private int[][] divide(int[][] arr, int length, int rowStart, int colStart, int colEnd) {
    int[][] dividedArray;
    if (length * length == arr.length * arr.length) {
      dividedArray = arr;
    } else {
      dividedArray = new int[length][length];
      for (int i = 0; i < dividedArray.length; i++) {
        dividedArray[i] = Arrays.copyOfRange(arr[rowStart++], colStart, colEnd);
      }
    }
    return dividedArray;
  }

}
