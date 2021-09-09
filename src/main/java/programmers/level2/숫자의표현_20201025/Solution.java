package programmers.level2.숫자의표현_20201025;

public class Solution {

  public int solution(int n) {
    int count = 1;
    for (int i = 1; i <= n / 2; i++) {
      if (check(i, n)) {
        count++;
      }
    }
    return count;
  }

  private boolean check(int target, int n) {
    int sum = 0;
    while (sum < n) {
      sum += target++;
    }
    return sum == n;
  }
}
