package codeWars.kyu7.indexedCapitalization_20201120;

public class Solution {

  public static String capitalize(String s, int[] ind) {
    char[] toCharArray = s.toCharArray();

    for (int index : ind) {
      if (index < s.length()) {
        toCharArray[index] = Character.toUpperCase(toCharArray[index]);
      }
    }

    return String.valueOf(toCharArray);
  }
}
