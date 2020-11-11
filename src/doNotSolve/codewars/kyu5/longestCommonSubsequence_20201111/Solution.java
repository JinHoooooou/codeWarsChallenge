package doNotSolve.codewars.kyu5.longestCommonSubsequence_20201111;

public class Solution {

  static String lcs;
  static int[][] lcsTable;
  static String target1;
  static String target2;

  public static String lcs(String x, String y) {

    target1 = "0" + x;
    target2 = "0" + y;
    lcsTable = new int[target1.length()][target2.length()];
    lcs = "";

    for (int i = 1; i < lcsTable.length; i++) {
      for (int j = 1; j < lcsTable[i].length; j++) {
        lcsTable[i][j] = target1.charAt(i) == target2.charAt(j)
            ? lcsTable[i - 1][j - 1] + 1
            : Math.max(lcsTable[i - 1][j], lcsTable[i][j - 1]);
      }
    }

    backTracking(target1.length() - 1, target2.length() - 1);

    return lcs;
  }

  private static void backTracking(int x, int y) {
    if (x == 0 || y == 0) {
      return;
    }
    if (lcsTable[x][y] > lcsTable[x - 1][y - 1] && lcsTable[x][y] > lcsTable[x - 1][y]
        && lcsTable[x][y] > lcsTable[x][y - 1]) {
      lcs = target1.charAt(x) + lcs;
      backTracking(x - 1, y - 1);
    } else if (lcsTable[x][y] > lcsTable[x][y - 1] && lcsTable[x][y] == lcsTable[x - 1][y]) {
      backTracking(x - 1, y);
    } else {
      backTracking(x, y - 1);
    }
  }
}
