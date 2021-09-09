package codeWars.kyu7.shorterConcat_20201016;

public class ReverseLonger {

  public static String shorterReverseLonger(String a, String b) {
    String shorter = a.length() < b.length() ? a : b;
    String longer = a.length() < b.length() ? b : a;

    return shorter + reverse(longer) + shorter;
  }

  private static String reverse(String longer) {
    return new StringBuilder(longer).reverse().toString();
  }
}
