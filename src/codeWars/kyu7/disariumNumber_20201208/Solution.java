package codeWars.kyu7.disariumNumber_20201208;

public class Solution {

  final static String TRUE = "Disarium !!";
  final static String FALSE = "Not !!";

  public static String disariumNumber(int number) {

    return calculate(String.valueOf(number)) == number ? TRUE : FALSE;
  }

  private static int calculate(String number) {
    int result = 0;
    for (int i = 0; i < number.length(); i++) {
      int digit = Character.getNumericValue(number.charAt(i));
      result += Math.pow(digit, i + 1);
    }
    return result;
  }
}
