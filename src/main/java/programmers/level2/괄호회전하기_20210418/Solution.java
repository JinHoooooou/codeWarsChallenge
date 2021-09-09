package programmers.level2.괄호회전하기_20210418;

public class Solution {

  public int solution(String s) {

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      String rotate = rotate(s, i);
      if (isValid(rotate)) {
        result++;
      }
    }
    return result;
  }

  private boolean isValid(String rotate) {
    int loop = rotate.length() / 2;
    for (int i = 0; i < loop; i++) {
      rotate = rotate.replaceAll("\\{}", "");
      rotate = rotate.replaceAll("\\[]", "");
      rotate = rotate.replaceAll("\\(\\)", "");
    }
    return rotate.isEmpty();
  }

  private String rotate(String s, int count) {
    return s.substring(count) + s.substring(0, count);
  }
}
