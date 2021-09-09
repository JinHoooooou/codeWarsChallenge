package programmers.level1.문자열내림차순으로배치하기_20201015;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {

  public String solution(String s) {
    return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder())
        .collect(Collectors.joining(""));
  }
}
