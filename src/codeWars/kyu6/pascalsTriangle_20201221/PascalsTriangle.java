package codeWars.kyu6.pascalsTriangle_20201221;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

  public static long[] generate(int level) {
    long[][] triangle = new long[level][];
    List<Long> list = new ArrayList<>();
    for (int i = 0; i < level; i++) {
      if (i == 0) {
        triangle[i] = new long[]{1};
        list.add(1L);
      } else if (i == 1) {
        triangle[i] = new long[]{1, 1};
        list.add(1L);
        list.add(1L);
      } else {
        triangle[i] = new long[i + 1];
        for (int j = 0; j < triangle[i].length; j++) {
          triangle[i][j] = getAboveElement(triangle, i, j) + getAboveLeftElement(triangle, i, j);
          list.add(triangle[i][j]);
        }
      }
    }

    return list.stream().mapToLong(x -> x).toArray();
  }

  private static long getAboveLeftElement(long[][] triangle, int i, int j) {
    return j - 1 < 0 ? 0 : triangle[i - 1][j - 1];
  }

  private static long getAboveElement(long[][] triangle, int i, int j) {
    return i - 1 < j ? 0 : triangle[i - 1][j];
  }
}
