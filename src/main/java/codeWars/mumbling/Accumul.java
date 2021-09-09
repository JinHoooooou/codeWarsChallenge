package codeWars.mumbling;

public class Accumul {

  public static String accum(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < i + 1; j++) {
        if (j == 0) {
          result += String.valueOf(s.charAt(i)).toUpperCase();
        } else {
          result += String.valueOf(s.charAt(i)).toLowerCase();
        }
      }
      if (i == s.length() - 1) {
        break;
      }
      result += "-";
    }
    return result;
  }
  /*
   * Best Practice
    public static String accum(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char target = s.charAt(i);
      result.append(Character.toUpperCase(target));
      for (int j = 0; j < i; j++) {
        result.append(Character.toLowerCase(target));
      }
      result.append("-");
    }

    return result.deleteCharAt(result.lastIndexOf("-")).toString();
  }
   */
}
