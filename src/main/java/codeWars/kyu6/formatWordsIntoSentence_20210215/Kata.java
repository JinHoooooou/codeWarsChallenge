package codeWars.kyu6.formatWordsIntoSentence_20210215;

import java.util.Arrays;

public class Kata {

  public static String formatWords(String[] words) {
    if (words == null) {
      return "";
    }
    String[] exceptEmpty = Arrays.stream(words).filter(x -> !x.isEmpty()).toArray(String[]::new);
    if (exceptEmpty.length == 0) {
      return "";
    }

    StringBuilder result = new StringBuilder(String.join(", ", exceptEmpty));
    if (result.lastIndexOf(",") != -1) {
      result.replace(result.lastIndexOf(","), result.lastIndexOf(",") + 1, " and");
    }
    return result.toString();
  }
}
