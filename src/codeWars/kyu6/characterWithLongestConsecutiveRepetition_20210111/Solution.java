package codeWars.kyu6.characterWithLongestConsecutiveRepetition_20210111;

public class Solution {

  public static Object[] longestRepetition(String s) {
    int currentCount = 0;
    int maxCount = 0;
    String maxCharacter = "";
    String lastCharacter = "";

    for (char ch : s.toCharArray()) {
      currentCount = lastCharacter.equals(ch + "") ? currentCount + 1 : 1;
      if (currentCount > maxCount) {
        maxCount = currentCount;
        maxCharacter = ch + "";
      }
      lastCharacter = ch + "";
    }
    return new Object[]{maxCharacter, maxCount};
  }
}
