package codeWars.kyu7.simpleStringReversal_20200801;

public class Solution {

  public static String solve(String s) {
    String[] result = s.split(" ");
    String reverse = new StringBuilder(s).reverse().toString().replace(" ", "");
    for (int i = 0; i < result.length; i++) {
      result[i] = reverse.substring(0, result[i].length());
      reverse = reverse.substring(result[i].length());
    }
    return String.join(" ", result);
  }
}
