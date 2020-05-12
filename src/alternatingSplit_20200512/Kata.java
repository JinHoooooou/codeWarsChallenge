package alternatingSplit_20200512;

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
    return "";
  }
}
