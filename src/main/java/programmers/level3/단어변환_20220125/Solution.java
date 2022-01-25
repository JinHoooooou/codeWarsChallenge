package programmers.level3.단어변환_20220125;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int result = Integer.MAX_VALUE;
  public Map<String, Boolean> visit;

  public int solution(String begin, String target, String[] words) {

    visit = new HashMap<>();
    for (String word : words) {
      visit.put(word, false);
    }
    dfs(begin, target, words, 0);
    return result == Integer.MAX_VALUE ? 0 : result;
  }

  private void dfs(String currentWord, String targetWord, String[] words, int distance) {

    if (currentWord.equals(targetWord)) {
      result = Math.min(result, distance);
      return;
    }

    for (String word : words) {
      if (!visit.get(word) && getCharDifferenceCount(currentWord, word) == 1) {
        visit.replace(word, true);
        dfs(word, targetWord, words, distance + 1);
        visit.replace(word, false);
      }
    }
  }

  private int getCharDifferenceCount(String a, String b) {
    if (a.length() != b.length()) {
      return -1;
    }

    int result = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        result++;
      }
    }
    return result;
  }
}
