package codeWars.kyu8.stringyStrings_20200617;

public class Kata {

  public static String stringy(int size) {
    String result = "";
    for (int i = 0; i < (size / 2) + 1; i++) {
      result += "10";
    }
    return result.substring(0, size);
  }
}
