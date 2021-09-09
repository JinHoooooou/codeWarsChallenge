package codeWars.kyu7.balancedNumber_20201111;

public class Solution {

  static final String BALANCED = "Balanced";
  static final String NOT_BALANCED = "Not Balanced";

  public static String balancedNum(long number) {
    String front = getFrontString(number);
    String end = getEndString(number);
    return getDigitSum(front) == getDigitSum(end) ? BALANCED : NOT_BALANCED;
  }

  private static int getDigitSum(String number) {
    return number.chars().mapToObj(Character::getNumericValue).mapToInt(x -> x).sum();
  }

  private static String getEndString(long number) {
    String toString = String.valueOf(number);
    int midIndex = toString.length() / 2;
    return toString.length() % 2 == 0
        ? toString.substring(midIndex + 1)
        : toString.substring(midIndex);
  }

  private static String getFrontString(long number) {
    String toString = String.valueOf(number);
    int midIndex = toString.length() / 2;
    return toString.length() % 2 == 0
        ? toString.substring(0, midIndex - 1)
        : toString.substring(0, midIndex + 1);
  }
}
