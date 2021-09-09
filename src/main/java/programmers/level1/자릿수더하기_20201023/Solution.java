package programmers.level1.자릿수더하기_20201023;

public class Solution {

  public int solution(int n) {
    return String.valueOf(n).chars().mapToObj(x -> Character.getNumericValue((char) x))
        .mapToInt(x -> x).sum();
  }
}
