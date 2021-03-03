package codeWars.kyu5.validParenthese_20210303;

public class Solution {

  public static boolean validParentheses(String parens) {
    parens = parens.replaceAll("[^\\(\\)]", "");

    int length = parens.length() / 2;
    for (int i = 0; i < length; i++) {
      parens = parens.replaceAll("\\(\\)", "");
    }
    return parens.isEmpty();
  }
}
