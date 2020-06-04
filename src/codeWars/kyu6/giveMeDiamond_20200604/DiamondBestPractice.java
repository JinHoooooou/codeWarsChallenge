package codeWars.kyu6.giveMeDiamond_20200604;

public class DiamondBestPractice {

  public static String print(int n) {
    if (n % 2 == 0 || n < 0) {
      return null;
    }
    StringBuilder diamond = new StringBuilder();
    for (int i = 1; i <= n; i += 2) {
      appendLine(diamond, i, n);
    }
    for (int i = n - 2; i > 0; i -= 2) {
      appendLine(diamond, i, n);
    }
    return diamond.toString();
  }

  private static void appendLine(StringBuilder diamond, int size, int totalSize) {
    int spaces = (totalSize - size) / 2;
    for (int j = 0; j < spaces; j++) {
      diamond.append(" ");
    }
    for (int j = 0; j < size; j++) {
      diamond.append("*");
    }
    diamond.append("\n");
  }
}
