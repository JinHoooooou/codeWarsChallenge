package codewars._6kyu.Casino_chips_20220317;

import java.util.Arrays;

public class Solution {

  public static int solve(int[] arr) {
    int result = 0;
    Arrays.sort(arr);
    while (arr[0] != 0) {
      arr[0]--;
      arr[2]--;
      result++;
      Arrays.sort(arr);
    }
    return result + arr[1];
  }
}
