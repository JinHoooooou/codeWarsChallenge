package programmers.level2.이진변환반복하기_20201118;

public class Solution {

  public int[] solution(String s) {
    int count = 0;
    int zeroCount = 0;
    String binary = s;

    while (!binary.equals("1")) {
      String exceptZero = binary.replaceAll("0", "");
      zeroCount += binary.length() - exceptZero.length();
      binary = Integer.toBinaryString(exceptZero.length());
      count++;
    }
    return new int[]{count, zeroCount};
  }
}
