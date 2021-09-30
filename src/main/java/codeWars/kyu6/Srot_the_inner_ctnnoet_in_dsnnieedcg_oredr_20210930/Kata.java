package codeWars.kyu6.Srot_the_inner_ctnnoet_in_dsnnieedcg_oredr_20210930;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

  public static String sortTheInnerContent(String sentence) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = sortInnerChars(words[i]);
    }
    return String.join(" ", words);
  }

  private static String sortInnerChars(String word) {
    if (word.length() < 2) {
      return word;
    }
    String[] innerChars = word.substring(1, word.length() - 1).split("");
    Arrays.sort(innerChars, Comparator.reverseOrder());
    String inner = String.join("", innerChars);
    return word.charAt(0) + inner + word.charAt(word.length() - 1);
  }
}
