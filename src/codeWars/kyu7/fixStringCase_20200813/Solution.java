package codeWars.kyu7.fixStringCase_20200813;

public class Solution {

  public static String solve(final String str) {
    int upperCount = 0;
    int lowerCount = 0;
    for (int i = 0; i < str.length(); i++) {
      char target = str.charAt(i);
      if (target >= 'A' && target <= 'Z') {
        upperCount++;
      } else {
        lowerCount++;
      }
    }
    return upperCount > lowerCount ? str.toUpperCase() : str.toLowerCase();
  }
}
