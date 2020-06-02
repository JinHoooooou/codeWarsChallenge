package codeWars.alternatingSplit_20200512;

public class Kata {

  public static String encrypt(final String text, final int n) {
    if (text == null || n < 1) {
      return text;
    }
    String tempText = text;
    String result = "";
    for (int i = 0; i < n; i++) {
      result = "";
      for (int j = 1; j < tempText.length(); j += 2) {
        result += "" + tempText.charAt(j);
      }
      for (int j = 0; j < tempText.length(); j += 2) {
        result += "" + tempText.charAt(j);
      }
      tempText = result;
    }
    return result;
  }

  public static String decrypt(final String encryptedText, final int n) {
    if (encryptedText == null || n < 1) {
      return encryptedText;
    }
    String tempText = encryptedText;
    String result = "";
    for (int i = 0; i < n; i++) {
      result = "";
      for (int j = 0, k = tempText.length() / 2; j < tempText.length() / 2; j++, k++) {
        result += "" + tempText.charAt(k) + tempText.charAt(j);
      }
      if (tempText.length() % 2 == 1) {
        result += "" + tempText.charAt(tempText.length() - 1);
      }
      tempText = result;
    }
    return result;
  }
}
