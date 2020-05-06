package splitStrings_20200506;

public class StringSplit {

  public static String[] solution(String s) {
    if (s.length() % 2 == 1) {
      s = s + "_";
    }
    String[] result = new String[s.length() / 2];
    for (int i = 0; i < result.length; i++) {
      String target = s.substring(0, 2);
      result[i] = target;
      s = s.substring(2);
    }

    return result;
  }
}
