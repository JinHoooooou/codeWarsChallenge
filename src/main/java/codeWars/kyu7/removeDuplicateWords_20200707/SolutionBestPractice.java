package codeWars.kyu7.removeDuplicateWords_20200707;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SolutionBestPractice {

  public static String removeDuplicateWords(String s) {
    return Arrays.stream(s.split(" "))
        .distinct()
        .collect(Collectors.joining(" "));
  }
}
