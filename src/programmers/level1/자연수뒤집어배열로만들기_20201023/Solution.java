package programmers.level1.자연수뒤집어배열로만들기_20201023;

public class Solution {

  public int[] solution(long n) {
    return new StringBuilder(String.valueOf(n)).reverse().toString().chars()
        .mapToObj(x -> Character.getNumericValue((char) x))
        .mapToInt(x -> x).toArray();
  }
}
