package codeWars.shortestWord;

import java.util.Arrays;

public class Kata {

  public static int findShort(String s) {
    int min = Arrays.stream(s.split(" ")).mapToInt((String::length)).min().getAsInt();
    return min;
    /*String[] wordsList = s.split(" ");
    int minLengthWord = Integer.MAX_VALUE;
    for(String eachWord : wordsList) {
      minLengthWord = Math.min(minLengthWord, eachWord.length());
    }
    return minLengthWord;*/
  }
}
