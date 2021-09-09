package codeWars.highestScoringWord_20200514;

public class Kata {

  public static String high(String s) {
    int highest = 0;
    String result = "";
    for (String word : s.split(" ")) {
      int wordScore = getWordScore(word);
      if (wordScore > highest) {
        highest = wordScore;
        result = word;
      }
    }
    return result;
  }

  private static int getWordScore(String word) {
    int wordScore = 0;
    for (int i = 0; i < word.length(); i++) {
      wordScore += word.charAt(i) - 96;
    }
    return wordScore;
  }
}
