package programmers.level2.올바른괄호_20201020;

public class Solution {

  public boolean solution(String s) {
    int length = s.length();
    int pairBracketCount = 0;
    for (int i = 0; i < length; i++) {
      pairBracketCount = s.charAt(i) == '(' ? pairBracketCount + 1 : pairBracketCount - 1;
      if (pairBracketCount < 0) {
        return false;
      }
    }
    return pairBracketCount == 0;
  }
}
