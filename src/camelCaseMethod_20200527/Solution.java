package camelCaseMethod_20200527;

public class Solution {

  public static String camelCase(String str) {
    String[] words = str.trim().split(" +");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
      result.append(word);
    }
    return result.toString();
  }
}
