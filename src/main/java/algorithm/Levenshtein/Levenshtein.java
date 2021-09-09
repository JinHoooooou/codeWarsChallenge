package algorithm.Levenshtein;

public class Levenshtein {

  public static int getDistance(String a, String b) {
    int[][] table = new int[a.length() + 1][b.length() + 1];

    for (int i = 1; i <= a.length(); i++) {
      table[i][0] = i;
    }
    for (int j = 1; j <= b.length(); j++) {
      table[0][j] = j;
    }

    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {
        int insert = table[i - 1][j] + 1;
        int delete = table[i][j - 1] + 1;
        int replace = (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1) + table[i - 1][j - 1];
      }
    }

    return table[a.length()][b.length()];
  }
}
