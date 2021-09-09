package programmers.country124;

public class Solution {

  public String solution(int n) {
    StringBuilder result = new StringBuilder();
    while (n != 0) {
      int reminder = n % 3 == 0 ? 4 : n % 3;
      n = n % 3 == 0 ? n / 3 - 1 : n / 3;
      result.append(reminder);
    }
    return result.reverse().toString();
  }
}
