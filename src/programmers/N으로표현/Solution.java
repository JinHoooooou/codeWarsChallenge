package programmers.N으로표현;

public class Solution {

  int result = -1;

  public int solution(int N, int number) {
    dfs(0, 0, N, number);
    return result;
  }

  private void dfs(int count, int currentResult, int N, int number) {
    int attach = N;
    if (count > 8) {
      result = -1;
      return;
    }
    if (currentResult == number) {
      if (result == -1 || result > count) {
        result = count;
      }
      return;
    }
    for (int i = 1; i < 9 - count; i++) {
      dfs(count + i, currentResult + attach, N, number);
      dfs(count + i, currentResult - attach, N, number);
      dfs(count + i, currentResult * attach, N, number);
      dfs(count + i, currentResult / attach, N, number);
      attach = attach * 10 + N;
    }
  }
}
