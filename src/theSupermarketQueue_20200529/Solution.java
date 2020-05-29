package theSupermarketQueue_20200529;

import java.util.Arrays;

public class Solution {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    return Arrays.stream(customers).sum();
  }
}
