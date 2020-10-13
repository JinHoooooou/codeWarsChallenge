package doNotSolve.programmers.level2.큰수만들기_20201012;

public class Solution {

  public String solution(String number, int k) {
    int resultStringLength = number.length() - k;
    StringBuilder current = new StringBuilder();
    int targetIndex = -1;
    while (current.length() != resultStringLength) {
      int maxDigit = 0;
      for (int i = targetIndex + 1; i <= k; i++) {
        int target = Character.getNumericValue(number.charAt(i));
        if (target > maxDigit) {
          maxDigit = target;
          targetIndex = i;
        }
      }
      current.append(maxDigit);
      k++;
    }
    return current.toString();
  }
}
