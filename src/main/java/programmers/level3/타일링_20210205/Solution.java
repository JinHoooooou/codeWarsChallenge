package programmers.level3.타일링_20210205;

public class Solution {

  public int solution(int n) {
    int first = 1;
    int second = 1;

    int result = 1;

    for (int i = 1; i < n; i++) {
      result = (first + second) % 1000000007;
      first = second;
      second = result;
    }
    return result;
  }
}
