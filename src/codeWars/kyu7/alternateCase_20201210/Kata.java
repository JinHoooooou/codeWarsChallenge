package codeWars.kyu7.alternateCase_20201210;

public class Kata {

  public static String alternateCase(final String string) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
        result.append(Character.toUpperCase(string.charAt(i)));
      } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
        result.append(Character.toLowerCase(string.charAt(i)));
      } else {
        result.append(string.charAt(i));
      }
    }
    return result.toString();
  }
}
