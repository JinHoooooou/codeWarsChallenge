package programmers.level1.최대공약수와최소공배수_20201027;

public class Solution {

  public static int[] solution(int n, int m) {
    int gcd = getGCD(n, m);
    return new int[]{gcd, (n * m) / gcd};
  }

  private static int getGCD(int n, int m) {
    if (m == 0) {
      return n;
    }
    return getGCD(m, n % m);
  }
}
