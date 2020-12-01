package codeWars.kyu7.buildSquare_20201201;

public class Kata {

  public static final String generateShape(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        result.append("+");
      }
      result.append("\n");
    }
    return n == 0 ? "" : result.substring(0, result.length() - 1);
  }
}
