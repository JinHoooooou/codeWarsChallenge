package codeWars.kyu8.sortAndStar_20200626;

import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s) {
    Arrays.sort(s);
    String[] firstWordToChar = s[0].split("");
    return String.join("***", firstWordToChar);
  }
}
