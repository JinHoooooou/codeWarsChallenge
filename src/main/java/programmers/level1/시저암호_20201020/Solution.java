package programmers.level1.시저암호_20201020;

import java.util.stream.Collectors;

public class Solution {

  public String solution(String s, int n) {
    return s.chars().map(c -> (char) c == ' ' ? ' ' :
        Character.isUpperCase((char) c)
            ? 'A' + ((c - 'A' + n) % 26)
            : 'a' + ((c - 'a' + n) % 26))
        .mapToObj(x -> String.valueOf((char) x))
        .collect(Collectors.joining());
  }
}
