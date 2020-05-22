package numberOfTrailingZerosOfN_20200522;

public class Solution {

  public static int zeros(int n) {
    int fiveCount = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 5 == 0) {
        fiveCount++;
      }
    }
    return fiveCount;
  }
}
