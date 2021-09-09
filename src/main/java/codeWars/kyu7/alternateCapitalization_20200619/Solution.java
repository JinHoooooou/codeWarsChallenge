package codeWars.kyu7.alternateCapitalization_20200619;

public class Solution {

  public static String[] capitalize(String s) {
    String[] result = new String[]{"", ""};
    char[] toCharArray = s.toUpperCase().toCharArray();
    for (int i = 0; i < toCharArray.length; i++) {
      if (i % 2 == 0) {
        result[0] += toCharArray[i];
        result[1] += Character.toLowerCase(toCharArray[i]);
      } else {
        result[0] += Character.toLowerCase(toCharArray[i]);
        result[1] += toCharArray[i];
      }
    }
    return result;
  }
}
