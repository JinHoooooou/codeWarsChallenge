package doNotSolve.programmers.level2.큰수만들기_20201012;

public class Solution {

  public String solution(String number, int k) {
    String result = "";
    int availableLastIndex = k;
    int startIndex = 0;
    while (result.length() < number.length() - k) {
      char maxDigit = '0';
      for (int i = startIndex; i <= availableLastIndex; i++) {
        if (maxDigit < number.charAt(i)) {
          maxDigit = number.charAt(i);
          startIndex = i + 1;
        }
      }
      result += maxDigit;
      availableLastIndex++;
    }

    return result;
  }
}
