package programmers.expectedTournament;

public class Solution {

  public int solution(int n, int a, int b) {
    int count = 1;
    while (Math.ceil(a / 2.0) != Math.ceil(b / 2.0)) {
      a = (int) Math.ceil(a / 2.0);
      b = (int) Math.ceil(b / 2.0);
      count++;
    }
    return count;
  }
}
