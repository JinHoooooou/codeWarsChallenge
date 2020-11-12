package programmers.level2.N개의최소공배수_20201112;

import java.util.Arrays;

public class Solution {

  public int solution(int[] arr) {
    Arrays.sort(arr);
    int lcm = 1;
    for (int i = 0; i < arr.length; i++) {
      lcm = (lcm * arr[i]) / gcd(lcm, arr[i]);
    }
    return lcm;
  }

  private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
