package theHighestProfitWins_20200511;

import java.util.Arrays;

public class MinMaxBestPractice {

  public static int[] minMax(int[] arr) {
    // Your awesome code here
    Arrays.sort(arr);
    return new int[]{arr[0], arr[arr.length - 1]};
  }
}
