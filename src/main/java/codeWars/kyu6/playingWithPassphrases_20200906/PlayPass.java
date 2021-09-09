package codeWars.kyu6.playingWithPassphrases_20200906;

public class PlayPass {

  public static String playPass(String s, int n) {
    s = shift(s, n);
    s = replace9Complement(s);
    s = replaceCase(s);
    return new StringBuilder(s).reverse().toString();
  }

  private static String replace9Complement(String s) {
    char[] toCharArray = s.toCharArray();
    for (int i = 0; i < toCharArray.length; i++) {
      if (toCharArray[i] >= '0' && toCharArray[i] <= '9') {
        toCharArray[i] = (char) ('9' - toCharArray[i] + '0');
      }
    }
    return String.valueOf(toCharArray);
  }

  private static String replaceCase(String s) {
    char[] toCharArray = s.toCharArray();
    for (int i = 0; i < toCharArray.length; i++) {
      if (i % 2 == 1 && (toCharArray[i] >= 'A' && toCharArray[i] <= 'Z')) {
        toCharArray[i] = Character.toLowerCase(toCharArray[i]);
      }
    }
    return String.valueOf(toCharArray);
  }

  private static String shift(String s, int n) {
    char[] toCharArray = s.toCharArray();
    for (int i = 0; i < toCharArray.length; i++) {
      if (toCharArray[i] >= 'A' && toCharArray[i] <= 'Z') {
        toCharArray[i] += n;
        if (toCharArray[i] > 'Z') {
          toCharArray[i] -= 26;
        }
      }
    }
    return String.valueOf(toCharArray);
  }
}
