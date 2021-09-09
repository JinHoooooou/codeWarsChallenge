package codeWars.kyu7.insertDash_20210111;

public class Solution {

  public static String insertDash(int num) {
    String[] digits = String.valueOf(num).split("");
    for (int i = 0; i < digits.length - 1; i++) {
      if (isOdd(digits[i]) && isOdd(digits[i + 1])) {
        digits[i] = digits[i] + "-";
      }
    }
    return String.join("", digits);
  }

  private static boolean isOdd(String digit) {
    return Integer.parseInt(digit) % 2 == 1;
  }
}
