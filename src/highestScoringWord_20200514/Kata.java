package highestScoringWord_20200514;

public class Kata {

  public static String high(String s) {
    String[] split = s.split(" ");
    int max = 0;
    String result = "";
    for (String word : split) {
      int wordScore = 0;
      for (int i = 0; i < word.length(); i++) {
        wordScore += word.charAt(i) - 96;
      }
      if (wordScore > max) {
        max = wordScore;
        result = word;
      }
    }
    return result;
  }
}
