package codeWars.kyu8.removeExclamationMarksInTheSentenceFromLeftToRight_20200723;

public class KataBestPractice {

  public static String remove(String s, int n) {
    while (n-- > 0) {
      s = s.replaceFirst("!", "");
    }
    return s;
  }
}
