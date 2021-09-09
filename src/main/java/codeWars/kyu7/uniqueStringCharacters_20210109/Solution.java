package codeWars.kyu7.uniqueStringCharacters_20210109;

public class Solution {

  public static String solve(String a, String b) {
    String exceptDuplicateA = a.replaceAll("[" + b + "]", "");
    String exceptDuplicateB = b.replaceAll("[" + a + "]", "");

    return exceptDuplicateA + exceptDuplicateB;
  }
}
