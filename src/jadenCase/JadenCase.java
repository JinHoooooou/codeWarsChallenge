package jadenCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

  public static String toJadenCase(String phrase) {
    if (phrase == null) {
      return null;
    }
    if (phrase.length() == 0) {
      return null;
    }
    String[] words = phrase.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
    }
    return Arrays.stream(phrase.split(" "))
        .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(
            Collectors.joining(" "));
  }
}
