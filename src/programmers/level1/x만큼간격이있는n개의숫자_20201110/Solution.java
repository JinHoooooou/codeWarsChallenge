package programmers.level1.x만큼간격이있는n개의숫자_20201110;

public class Solution {

  public long[] solution(int x, int n) {
    long[] result = new long[n];
    for (int i = 0; i < n; i++) {
      result[i] = (long) x * (i + 1);
    }
    return result;
  }
}
