package numberOfTrailingZerosOfN_20200522;

public class Solution {

  public static int zeros(int n) {
    int fiveCount = 0;
    while (n >= 5) {
      fiveCount += n / 5;
      n /= 5;
    }
    return fiveCount;
  }
}
