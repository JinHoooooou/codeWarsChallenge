package codeWars.kyu7.strongNumber_20201208;

public class StrongNumber {

  static final String TRUE = "STRONG!!!!";
  static final String FALSE = "Not Strong !!";

  public static String isStrongNumber(int num) {

    return calculate(num) == num ? TRUE : FALSE;
  }

  private static int calculate(int num) {
    String toString = String.valueOf(num);
    int result = 0;
    for (int i = 0; i < toString.length(); i++) {
      int digit = Character.getNumericValue(toString.charAt(i));
      result += factorial(digit);
    }
    return result;
  }

  private static int factorial(int number) {
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }
}
