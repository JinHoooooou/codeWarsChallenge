package codeWars.kyu7.reverseLetter_20200711;

public class Kata {

  public static String reverseLetter(final String str) {
    String onlyAlphabetString = str.replaceAll("[^a-z]", "");
    return new StringBuilder(onlyAlphabetString).reverse().toString();
  }
}
