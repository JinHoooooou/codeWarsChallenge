package codeWars.kyu8.removeExclamationMarksInTheSentenceFromLeftToRight_20200723;

public class Kata {

  public static String remove(String s, int n) {
    for (int i = 0; i < n && s.contains("!"); i++) {
      int index = s.indexOf('!');
      String before = s.substring(0, index);
      String after = s.substring(index + 1);
      s = before + after;
    }
    return s;
  }
}
