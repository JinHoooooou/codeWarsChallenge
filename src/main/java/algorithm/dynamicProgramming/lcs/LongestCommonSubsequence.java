package algorithm.dynamicProgramming.lcs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class LongestCommonSubsequence {

  @Test
  public void testLcsLength() {
    assertThat(lcsLength("ADCABA", "ABCBDAB"), is(4));
    assertThat(lcs("ADCABA", "ABCBDAB"), is("ADAB"));
  }

  public int lcsLength(String x, String y) {
    int maxLength = 0;

    x = "0" + x;
    y = "0" + y;
    int[][] lcsTable = new int[x.length()][y.length()];

    for (int i = 1; i < x.length(); i++) {
      for (int j = 1; j < y.length(); j++) {
        if (x.charAt(i) == y.charAt(j)) {
          lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1;
          maxLength = lcsTable[i][j];
        } else {
          lcsTable[i][j] = Math.max(lcsTable[i][j - 1], lcsTable[i - 1][j]);
        }
      }
    }
    return maxLength;
  }

  public String lcs(String x, String y) {
    x = "0" + x;
    y = "0" + y;
    int[][] lcsTable = getLcsTable(x, y);

    StringBuilder lcs = new StringBuilder();
    backTracking(lcs, x.length() - 1, y.length() - 1, lcsTable, x);

    return lcs.toString();
  }

  private int[][] getLcsTable(String x, String y) {
    int[][] lcsTable = new int[x.length()][y.length()];

    for (int i = 1; i < x.length(); i++) {
      for (int j = 1; j < y.length(); j++) {
        if (x.charAt(i) == y.charAt(j)) {
          lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1;
        } else {
          lcsTable[i][j] = Math.max(lcsTable[i][j - 1], lcsTable[i - 1][j]);
        }
      }
    }
    return lcsTable;
  }

  private void backTracking(StringBuilder lcs, int m, int n, int[][] lcsTable, String x) {
    if (m == 0 || n == 0) {
      return;
    }
    if (lcsTable[m][n] > lcsTable[m - 1][n - 1]
        && lcsTable[m][n] > lcsTable[m][n - 1]
        && lcsTable[m][n] > lcsTable[m - 1][n]) {
      lcs.insert(0, x.charAt(m));
      backTracking(lcs, m - 1, n - 1, lcsTable, x);
    } else if (lcsTable[m][n] > lcsTable[m - 1][n]
        && lcsTable[m][n] == lcsTable[m][n - 1]) {
      backTracking(lcs, m, n - 1, lcsTable, x);
    } else {
      backTracking(lcs, m - 1, n, lcsTable, x);
    }
  }
}
