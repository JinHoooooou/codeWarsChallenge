package programmers.level1.이상한문자만들기_20201021;

public class Solution {

  public String solution(String s) {
    char[] toArray = s.toCharArray();
    int wordIndex = 0;
    for (int i = 0; i < toArray.length; i++) {
      if (toArray[i] == ' ') {
        wordIndex = 0;
      } else {
        toArray[i] = wordIndex % 2 == 0 ? Character.toUpperCase(toArray[i])
            : Character.toLowerCase(toArray[i]);
        wordIndex++;
      }
    }
    return String.valueOf(toArray);
  }
}
