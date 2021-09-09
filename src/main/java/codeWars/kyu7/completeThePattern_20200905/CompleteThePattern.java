package codeWars.kyu7.completeThePattern_20200905;

public class CompleteThePattern {

  static final String EMPTY_STRING = "";

  public static String pattern(int n) {
    return n < 1 ? EMPTY_STRING : getPattern(n);
  }

  private static String getPattern(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        result.append(j);
      }
      result.append("\n");
    }
    return result.substring(0, result.length() - 1);
  }
}
