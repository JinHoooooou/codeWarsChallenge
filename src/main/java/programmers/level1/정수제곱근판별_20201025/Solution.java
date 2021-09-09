package programmers.level1.정수제곱근판별_20201025;

public class Solution {

  public long solution(long n) {

    return Math.sqrt(n) == Math.ceil(Math.sqrt(n)) ? (long) Math.pow((Math.sqrt(n) + 1), 2) : -1;
  }
}
