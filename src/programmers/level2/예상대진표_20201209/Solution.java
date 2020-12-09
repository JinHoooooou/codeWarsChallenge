package programmers.level2.예상대진표_20201209;

public class Solution {

  public int solution(int n, int a, int b) {
    int right = Math.max(a, b);
    int left = Math.min(a, b);
    int count = 1;
    while (Math.ceil(right / 2.0) != Math.ceil(left / 2.0)) {
      right = (int) Math.ceil(right / 2.0);
      left = (int) Math.ceil(left / 2.0);
      count++;
    }
    return count;
  }
}
