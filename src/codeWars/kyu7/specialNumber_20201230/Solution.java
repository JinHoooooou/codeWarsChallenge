package codeWars.kyu7.specialNumber_20201230;

public class Solution {

  static final String TRUE = "Special!!";
  static final String FALSE = "NOT!!";

  public static String specialNumber(int number) {
    String toString = String.valueOf(number);

    return toString.matches("[0-5]+") ? TRUE : FALSE;
  }
}
