package splitStrings_20200506;

public class StringSplitBestPractice {

  public static String[] solution(String s) {
    s = (s.length() % 2 == 0) ? s : s + "_";
    return s.split("(?<=\\G.{2})");
  }
}
