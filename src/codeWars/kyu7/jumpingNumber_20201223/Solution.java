package codeWars.kyu7.jumpingNumber_20201223;

public class Solution {

  static final String TRUE = "Jumping!!";
  static final String FALSE = "Not!!";

  public static String jumpingNumber(int number) {
    String toString = String.valueOf(number);
    for (int i = 1; i < toString.length(); i++) {
      if (Math.abs(toString.charAt(i) - toString.charAt(i - 1)) != 1) {
        return FALSE;
      }
    }
    return TRUE;
  }
}
