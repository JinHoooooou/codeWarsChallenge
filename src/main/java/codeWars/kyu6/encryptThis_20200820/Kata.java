package codeWars.kyu6.encryptThis_20200820;

public class Kata {

  public static String encryptThis(String text) {
    if (text.equals("")) {
      return "";
    }
    String[] split = text.split(" ");
    for (int i = 0; i < split.length; i++) {
      split[i] = buildEncryption(split[i]);
    }
    return String.join(" ", split);
  }

  private static String buildEncryption(String word) {
    if (word.length() == 1) {
      return "" + (int) word.charAt(0);
    }
    if (word.length() == 2) {
      return (int) word.charAt(0) + "" + word.charAt(1);
    }
    return ((int) word.charAt(0)) + "" + word.charAt(word.length() - 1) + word
        .substring(2, word.length() - 1) + word.charAt(1);
  }
}
