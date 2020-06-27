package codeWars.kyu7.anagramDetection_20200627;

import java.util.Arrays;

public class Kata {

  public static boolean isAnagram(String test, String original) {
    char[] testCharArray = test.toUpperCase().toCharArray();
    char[] originalCharArray = original.toUpperCase().toCharArray();
    Arrays.sort(testCharArray);
    Arrays.sort(originalCharArray);
    return Arrays.equals(testCharArray, originalCharArray);
  }
}
