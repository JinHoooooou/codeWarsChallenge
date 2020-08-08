package programmers.immigration;

import java.util.Arrays;

public class Solution {

  public long solution(int n, int[] times) {
    Arrays.sort(times);

    long maxTime = n * (long) times[times.length - 1];
    long minTime = n * (long) times[0] / times.length;
    long resultTime = Long.MAX_VALUE;

    while (minTime <= maxTime) {
      long mid = (maxTime + minTime) / 2;
      if (canAfford(times, n, mid)) {
        resultTime = Math.min(resultTime, mid);
        maxTime = mid - 1;
      } else {
        minTime = mid + 1;
      }
    }
    return resultTime;
  }

  private boolean canAfford(int[] times, int n, long mid) {
    long passCount = 0;
    for (int i = 0; i < times.length; i++) {
      passCount += mid / times[i];
    }
    return passCount >= n;
  }
}
