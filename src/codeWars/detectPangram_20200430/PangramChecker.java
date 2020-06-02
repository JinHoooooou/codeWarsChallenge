package codeWars.detectPangram_20200430;

public class PangramChecker {

  public static boolean check(String sentence) {
    sentence = sentence.toLowerCase();
    for (char index = 'a'; index <= 'z'; index++) {
      if (!sentence.contains(String.valueOf(index))) {
        return false;
      }
    }
    return true;
  }
}
