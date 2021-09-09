package codeWars.kyu7.automorphicNumber_20201124;

public class Solution {

  static final String TRUE = "Automorphic";
  static final String FALSE = "Not!!";

  public static String autoMorphic(int number) {
    String toString = String.valueOf(number);
    String square = String.valueOf(number * number);
    int squareIndex = square.length() - toString.length();

    for (int i = 0; i < toString.length(); i++) {
      if (toString.charAt(i) != square.charAt(squareIndex++)) {
        return FALSE;
      }
    }

    return TRUE;
  }
}
