package doNotSolve.codewars.kyu5.didYouMean;

public class Dictionary {

  private final String[] words;

  public Dictionary(String[] words) {
    this.words = words;
  }

  public String findMostSimilar(String to) {

    int minDistance = Integer.MAX_VALUE;
    String result = "";

    for (String word : words) {
      int distance = getDistance(word, to);
      if (distance < minDistance) {
        minDistance = distance;
        result = word;
      }
    }
    return result;
  }

  private int getDistance(String a, String b) {

    int[][] table = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i <= a.length(); i++) {
      table[i][0] = i;
    }
    for (int i = 1; i <= b.length(); i++) {
      table[0][i] = i;
    }

    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {
        int insert = table[i - 1][j] + 1;
        int delete = table[i][j - 1] + 1;
        int replace = (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1) + table[i - 1][j - 1];
        table[i][j] = Math.min(insert, Math.min(delete, replace));
      }
    }

    return table[a.length()][b.length()];
  }
}
