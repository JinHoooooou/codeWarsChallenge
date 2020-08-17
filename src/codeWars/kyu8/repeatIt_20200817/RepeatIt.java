package codeWars.kyu8.repeatIt_20200817;

public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result += toRepeat;
    }
    return toRepeat instanceof String ? (result) : "Not a String";
  }
}
