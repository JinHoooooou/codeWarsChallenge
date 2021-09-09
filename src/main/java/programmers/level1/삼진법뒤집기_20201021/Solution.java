package programmers.level1.삼진법뒤집기_20201021;

public class Solution {

  public int solution(int n) {
    return Integer.parseInt(reversedTrinary(n), 3);
  }

  private String reversedTrinary(int n) {
    return new StringBuilder(Integer.toString(n, 3)).reverse().toString();
  }
}
