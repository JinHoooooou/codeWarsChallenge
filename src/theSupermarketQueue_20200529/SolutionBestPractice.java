package theSupermarketQueue_20200529;

import java.util.Arrays;

public class SolutionBestPractice {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    int[] result = new int[n];
    for (int i = 0; i < customers.length; i++) {
      result[0] += customers[i];
      Arrays.sort(result);
    }
    return result[n - 1];
  }

}
