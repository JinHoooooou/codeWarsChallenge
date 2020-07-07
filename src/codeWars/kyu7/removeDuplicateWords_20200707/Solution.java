package codeWars.kyu7.removeDuplicateWords_20200707;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static String removeDuplicateWords(String s) {
    List<String> wordsList = new ArrayList<>();
    for (String word : s.split(" ")) {
      if (!wordsList.contains(word)) {
        wordsList.add(word);
      }
    }
    return String.join(" ", wordsList);
  }
}
