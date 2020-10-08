package programmers.가운데_글자_가져오기;

public class Solution {

  public String solution(String s) {

    return s.length() % 2 == 1 ? "" + s.charAt(s.length() / 2)
        : "" + s.charAt(s.length() / 2 - 1) + s.charAt(s.length() / 2);
  }
}
