package codeWars.kyu4.pyramidSlideDown_20200915;

import java.util.Arrays;

public class LongestSlideDown {

  public static int longestSlideDown(int[][] pyramid) {
    int[][] sumOfPyramid = copyPyramid(pyramid);

    for (int floor = sumOfPyramid.length - 1; floor > 0; floor--) {
      for (int i = 0; i < sumOfPyramid[floor - 1].length; i++) {
        sumOfPyramid[floor - 1][i] += Math.max(sumOfPyramid[floor][i], sumOfPyramid[floor][i + 1]);
      }
    }
    return sumOfPyramid[0].length == 0 ? 0 : sumOfPyramid[0][0];
  }

  private static int[][] copyPyramid(int[][] pyramid) {
    int[][] result = new int[pyramid.length][];
    for (int i = 0; i < result.length; i++) {
      result[i] = Arrays.copyOf(pyramid[i], pyramid[i].length);
    }
    return result;
  }
}
