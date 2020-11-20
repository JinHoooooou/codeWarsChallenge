package programmers.level2.영어끝말잇기_20201120;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int n, String[] words) {
    List<String> wordsDatabase = new ArrayList<>();
    String lastWord = words[0];
    wordsDatabase.add(lastWord);

    for (int i = 1; i < words.length; i++) {
      int person = i % n;
      String word = words[i];
      if (word.charAt(0) != lastWord.charAt(lastWord.length() - 1)
          || wordsDatabase.contains(word)) {
        return new int[]{person + 1, i / n + 1};
      }
      lastWord = word;
      wordsDatabase.add(lastWord);
    }
    return new int[]{0, 0};
  }
}
