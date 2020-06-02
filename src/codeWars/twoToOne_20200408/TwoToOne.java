package codeWars.twoToOne_20200408;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {

  public static String longest(String s1, String s2) {
    String temp = s1 + s2;
    return Stream.of(temp.split("")).sorted().distinct().collect(Collectors.joining());
    /*char[] result = String.join("", s1, s2).toCharArray();
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < i; j++) {
        if (result[i] == result[j]) {
          result[j] = ' ';
        }
      }
    }
    Arrays.sort(result);
    return String.valueOf(result).trim();
     */
  }
}
