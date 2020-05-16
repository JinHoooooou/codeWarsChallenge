package reversedWords_20200516;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWordsBestPractice {

  public static String reversedWords(String str) {
    List<String> words = Arrays.asList(str.split(" "));
    Collections.reverse(words);
    return String.join(" ", words);
  }
}
