package programmers.level2.다음큰숫자_20201023;

public class Solution {

  public int solution(int n) {
    int bitCount = Integer.bitCount(n);
    for (int i = n + 1; ; i++) {
      if (bitCount == Integer.bitCount(i)) {
        return i;
      }
    }
  }
}
